package com.kayalprints.calculator.ui.currencyConversion;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kayalprints.calculator.CurrencyDB.Currency;
import com.kayalprints.calculator.CurrencyDB.CurrencyDBViewModel;
import com.kayalprints.calculator.R;
import com.kayalprints.calculator.classes.CurrencyConvertorData;
import com.kayalprints.calculator.databinding.FragmentCurrencyConvertorBinding;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CurrencyConversionFragment extends Fragment {

    private FragmentCurrencyConvertorBinding binding;
    private ArrayAdapter<String> currencyAdapter;
    private SharedPreferences sharedPreferences;
    private Map<String, String> currencies;
    private Map<String, Double> currencyValue;
    private CurrencyConversionViewModel currencyConversionViewModel;
    private CurrencyDBViewModel currencyDBViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        currencyConversionViewModel =
                new ViewModelProvider(this).get(CurrencyConversionViewModel.class);
        currencyDBViewModel = new CurrencyDBViewModel(requireActivity());

        currencies = new TreeMap<>();
        currencyValue = new TreeMap<>();

        binding = FragmentCurrencyConvertorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        sharedPreferences = requireContext().getSharedPreferences(requireContext().getString(R.string.preference_name), Context.MODE_PRIVATE);

        long prevTime = sharedPreferences.getLong("prevTime",0);

        if(prevTime != 0 && System.currentTimeMillis() - prevTime < 86400000) loadCurrencyData();
        else fetchCurrencyData();

        CurrencyConvertorData currencyConvertorData = new CurrencyConvertorData();
        binding.setData(currencyConvertorData);




//        currencyAdapter = new ArrayAdapter<>(root.getContext(), R.layout.list_item);

//        binding.textViewCurrencyConvFrom.setAdapter(currencyAdapter);
//        binding.spinnerCurrencyConvTo.setAdapter(currencyAdapter);
//        binding.spinnerCurrencyConvFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                currencyConvertorData.setFromCurrency((String) parent.getItemAtPosition(position));
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {}
//        });
//
//        binding.spinnerCurrencyConvTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                currencyConvertorData.setToCurrency((String) parent.getItemAtPosition(position));
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {}
//        });

        binding.swipeLayout.setOnRefreshListener(this::refreshData);
        binding.swipeLayout.setRefreshing(true);

        return root;
    }

    private void refreshData() {
        loadCurrencyData();
        if(currencies.size() < 170) fetchCurrencyData();
    }

    /* Load the currency Data from the local database */
    private void loadCurrencyData() {
//        binding.progressBarCurrencyConvLoad.setVisibility(View.VISIBLE);
        currencyDBViewModel.getAllCurrencies().observe(requireActivity(), allCurrencies -> {
            if(allCurrencies != null) {
                currencies.clear();
                currencyValue.clear();
                for (Currency c : allCurrencies) {
                    String name = c.getName(), fullName;
                    double value;
                    if(name.equals("USD")) {
                        fullName = "United States Dollar"; // This is used because as values are getting respect to USD,
                        // USD is not added from API in the allCurrencies
                        value = 1.0;
                    }
                    else {
                        fullName = c.getFullName();
                        value = c.getValue();
                    }
                    currencies.put(name, fullName);
                    currencyValue.put(name, value);
                }
                updateAdapter(currencies.values());
            } else Toast.makeText(requireContext(), "No database data found...", Toast.LENGTH_SHORT).show();
            binding.swipeLayout.setRefreshing(false);
        });
    }

    /* Load the currency data from API call */
    private void fetchCurrencyData() {
        currencyConversionViewModel.getmCurrencyList().observe(requireActivity(), currencyList -> {
            currencies = currencyList.getCurrencies().allCurrency();
            updateAdapter(currencies.values());

            if(currencies.get("USD") != null && !currencies.get("USD").isEmpty()) {
                currencyConversionViewModel.getmCurrencyRate().observe(requireActivity(), currencyRate -> {
                    currencyValue = currencyRate.getQuotes().allCurrencyNValue();
                    updateDBCurrencyValues(currencyValue, currencyDBViewModel);
                });
            }
        });
    }

    private void updateDBCurrencyValues(@NonNull Map<String, Double> currencyValue, CurrencyDBViewModel viewModel) {
//        binding.progressBarCurrencyConvLoad.setVisibility(View.VISIBLE);
        for (String name : currencyValue.keySet()) {
            double val = (currencyValue.get(name) != null) ? currencyValue.get(name) : 0;
            viewModel.insert(new Currency(name, val, currencies.get(name))); // Here exceptions problem
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong("prevTime",System.currentTimeMillis());
        editor.apply();
        binding.swipeLayout.setRefreshing(false);
    }

    private void updateAdapter(Collection<String> fullNames) {
        currencyAdapter.addAll(fullNames);
        currencyAdapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}