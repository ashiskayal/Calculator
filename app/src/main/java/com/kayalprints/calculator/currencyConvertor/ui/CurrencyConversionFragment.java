package com.kayalprints.calculator.currencyConvertor.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kayalprints.calculator.Currency;
import com.kayalprints.calculator.currencyConvertor.db.room.CurrencyDBViewModel;
import com.kayalprints.calculator.R;
import com.kayalprints.calculator.CurrencyConvertorData;
import com.kayalprints.calculator.databinding.FragmentCurrencyConvertorBinding;
import com.kayalprints.calculator.currencyConvertor.fragment.ChooseCurrencyDialog;

import java.util.Map;
import java.util.TreeMap;

public class CurrencyConversionFragment extends Fragment {

    private FragmentCurrencyConvertorBinding binding;
    private SharedPreferences sharedPreferences;
    private Map<String, String> currencies;
    private Map<String, Double> currencyValue;
    private Map<String, Currency> currencyMap;
    private CurrencyConversionViewModel currencyConversionViewModel;
    private CurrencyDBViewModel currencyDBViewModel;

    private static CurrencyConvertorData currencyConvertorData;

    private static Currency fromCurrency = new Currency("USD",1.0,"United States Dollar"),
            toCurrency = new Currency("USD",1.0,"United States Dollar");
    public static boolean operation = false; // false when fromCurrency choosing, true when toCurrency choosing

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        currencyConversionViewModel =
                new ViewModelProvider(this).get(CurrencyConversionViewModel.class);
        currencyDBViewModel = new CurrencyDBViewModel(requireActivity());

        // Initializing the maps
        currencies = new TreeMap<>();
        currencyValue = new TreeMap<>();
        currencyMap = new TreeMap<>();

        binding = FragmentCurrencyConvertorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        sharedPreferences = requireContext().getSharedPreferences(requireContext().getString(R.string.preference_name), Context.MODE_PRIVATE);

        // Checking if already data are loaded 24hrs ago in local database or not
        long prevTime = sharedPreferences.getLong("prevTime",0);

        if(prevTime != 0 && System.currentTimeMillis() - prevTime < 86400000) loadCurrencyData();
        else fetchCurrencyData();

        // Setting the binding variables
        currencyConvertorData =
                new CurrencyConvertorData(CurrencyConversionFragment.fromCurrency, CurrencyConversionFragment.toCurrency);
        binding.setData(currencyConvertorData);

        // Click listener to the text views in order to choose currencies
        binding.textViewCurrencyConvFrom.setOnClickListener(v -> {
            operation = false;
            ChooseCurrencyDialog dialog = new ChooseCurrencyDialog(currencyMap);
            dialog.show(getChildFragmentManager(), "ChooseCurrencyDialog");
        });

        binding.textViewCurrencyConvTo.setOnClickListener(v -> {
            operation = true;
            ChooseCurrencyDialog dialog = new ChooseCurrencyDialog(currencyMap);
            dialog.show(requireActivity().getSupportFragmentManager(), "ChooseCurrencyDialog");
        });

        // Operation to do by swap refresh
        binding.swipeLayout.setOnRefreshListener(this::refreshData);
        binding.swipeLayout.setRefreshing(true);

        return root;
    }

    // Takes the data from currencies and currencyValue map and set to currencyMap
    private void updateCurrencyMap() {
        for (String name : currencies.keySet()) currencyMap.put(name, new Currency(name, currencies.get(name)));
        for (String name : currencyValue.keySet()) {
            try {
                currencyMap.get(name).setValue(currencyValue.get(name));
            } catch (NullPointerException ignore) {
                Log.d("ashis","error");
            }
        }
    }

    private void refreshData() {
        loadCurrencyData();
        if(currencies.size() < 170) fetchCurrencyData(); // Total 170 currencies are there
    }

    /* Load the currency Data from the local database */
    private void loadCurrencyData() {
        currencyDBViewModel.getAllCurrencies().observe(requireActivity(), allCurrencies -> {
            if(allCurrencies != null) {
                currencies.clear();
                currencyValue.clear();
                for (Currency c : allCurrencies)
                    currencyMap.put(c.getName(), c);

            } else Toast.makeText(requireContext(), "No database data found...", Toast.LENGTH_SHORT).show();
            binding.swipeLayout.setRefreshing(false);
        });
    }

    /* Load the currency data from API call */
    private void fetchCurrencyData() {
        currencyConversionViewModel.getmCurrencyList().observe(requireActivity(), currencyList -> {
            currencies = currencyList.getCurrencies().allCurrency();

            currencyConversionViewModel.getmCurrencyRate().observe(requireActivity(), currencyRate -> {
                currencyValue = currencyRate.getQuotes().allCurrencyNValue();

                updateCurrencyMap();
                updateDBCurrencyValues();
            });
        });
    }

    private void updateDBCurrencyValues() {
        for (String name : currencyMap.keySet()) {
            try {
                currencyDBViewModel.insert(currencyMap.get(name));
            } catch (NullPointerException ignore) {}
        }

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong("prevTime",System.currentTimeMillis());
        editor.apply();
        binding.swipeLayout.setRefreshing(false);
    }

    public static void setFromCurrency(Currency fromCurrency) {
        CurrencyConversionFragment.fromCurrency = fromCurrency;
        currencyConvertorData.setFromCurrency(fromCurrency);
    }

    public static void setToCurrency(Currency toCurrency) {
        CurrencyConversionFragment.toCurrency = toCurrency;
        currencyConvertorData.setToCurrency(toCurrency);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}