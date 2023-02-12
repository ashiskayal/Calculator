package com.kayalprints.calculator.retrofit.currencyConvert.service;

import com.kayalprints.calculator.retrofit.currencyConvert.model.list.CurrencyList;
import com.kayalprints.calculator.retrofit.currencyConvert.model.live.CurrencyRate;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrencyService {

    @GET("list")
    Call<CurrencyList> getAllCurrencies(@Query("apikey") String apiKey);

    @GET("live")
    Call<CurrencyRate> getCurrencyRates(@Query("apikey") String apiKey);
}
