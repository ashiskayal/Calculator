package com.kayalprints.calculator.currencyConvertor.ui;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.kayalprints.calculator.currencyConvertor.db.retrofit.model.list.CurrencyList;
import com.kayalprints.calculator.currencyConvertor.db.retrofit.model.live.CurrencyRate;
import com.kayalprints.calculator.currencyConvertor.db.retrofit.service.CurrencyRepository;

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