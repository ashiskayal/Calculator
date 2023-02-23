package com.kayalprints.calculator.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kayalprints.calculator.Currency;
import com.kayalprints.calculator.R;
import com.kayalprints.calculator.ui.currencyConversion.CurrencyConversionFragment;

import java.util.Map;

public class ChooseCurrencyDialog extends DialogFragment {

    private final Map<String, Currency> currencyMap;

    public ChooseCurrencyDialog(Map<String, Currency> map) {
        this.currencyMap = map;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_choose_currency_dialog, container);

        RecyclerView rv = v.findViewById(R.id.recyclerViewChooseCurrency);
        ChooseCurrencyRecyclerAdapter adapter = new ChooseCurrencyRecyclerAdapter(this.currencyMap);
        rv.setAdapter(adapter);

        adapter.setOnCurrencyClickListener(currency -> {
            if(CurrencyConversionFragment.operation) CurrencyConversionFragment.setToCurrency(currency);
            else CurrencyConversionFragment.setFromCurrency(currency);
            dismiss();
        });
        return v;
    }
}
