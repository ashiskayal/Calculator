package com.kayalprints.calculator.ui.currencyConversion;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.kayalprints.calculator.retrofit.currencyConvert.model.list.CurrencyList;
import com.kayalprints.calculator.retrofit.currencyConvert.model.live.CurrencyRate;
import com.kayalprints.calculator.retrofit.currencyConvert.service.CurrencyRepository;

public class CurrencyConversionViewModel extends AndroidViewModel {

    private final CurrencyRepository repository;

    public CurrencyConversionViewModel(Application application) {
        super(application);
        repository = new CurrencyRepository(application);
    }

    public MutableLiveData<CurrencyList> getmCurrencyList() {
        return repository.getCurrencyList();
    }

    public MutableLiveData<CurrencyRate> getmCurrencyRate() {
        return repository.getCurrencyRate();
    }
}