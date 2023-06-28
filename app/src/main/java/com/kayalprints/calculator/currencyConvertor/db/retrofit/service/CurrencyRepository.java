package com.kayalprints.calculator.currencyConvertor.db.retrofit.service;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.kayalprints.calculator.R;
import com.kayalprints.calculator.currencyConvertor.db.retrofit.model.live.CurrencyRate;
import com.kayalprints.calculator.currencyConvertor.db.retrofit.model.list.CurrencyList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrencyRepository {

    private final MutableLiveData<CurrencyList> currencyList;
    private final MutableLiveData<CurrencyRate> currencyRate;

    private final Application application;

    public CurrencyRepository(Application application) {
        this.application = application;
        currencyList = new MutableLiveData<>();
        currencyRate = new MutableLiveData<>();
    }

    public MutableLiveData<CurrencyList> getCurrencyList() {
        CurrencyService listService = CurrencyInstance.getCurrService();
        Call<CurrencyList> currencyListCall = listService.getAllCurrencies(application.getApplicationContext().getString(R.string.api_key));
        currencyListCall.enqueue(new Callback<CurrencyList>() {
            @Override
            public void onResponse(@NonNull Call<CurrencyList> call, @NonNull Response<CurrencyList> response) {
                CurrencyList responseCurrencyList = response.body();
                if(responseCurrencyList != null && responseCurrencyList.getSuccess())
                    currencyList.setValue(responseCurrencyList);
            }

            @Override
            public void onFailure(@NonNull Call<CurrencyList> call, @NonNull Throwable t) {}
        });

        return currencyList;
    }

    public MutableLiveData<CurrencyRate> getCurrencyRate() {
        CurrencyService listService = CurrencyInstance.getCurrService();
        Call<CurrencyRate> currencyRateCall = listService.getCurrencyRates(application.getApplicationContext().getString(R.string.api_key));
        currencyRateCall.enqueue(new Callback<CurrencyRate>() {
            @Override
            public void onResponse(@NonNull Call<CurrencyRate> call, @NonNull Response<CurrencyRate> response) {
                CurrencyRate responseCurrencyRate = response.body();
                if(responseCurrencyRate != null && responseCurrencyRate.getSuccess())
                    currencyRate.setValue(responseCurrencyRate);
            }

            @Override
            public void onFailure(@NonNull Call<CurrencyRate> call, @NonNull Throwable t) {}
        });

        return currencyRate;
    }
}
