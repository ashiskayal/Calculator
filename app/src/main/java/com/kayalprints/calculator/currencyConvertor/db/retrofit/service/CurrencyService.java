package com.kayalprints.calculator.currencyConvertor.db.retrofit.service;

import com.kayalprints.calculator.currencyConvertor.db.retrofit.model.live.CurrencyRate;
import com.kayalprints.calculator.currencyConvertor.db.retrofit.model.list.CurrencyList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrencyService {

    @GET("list")
    Call<CurrencyList> getAllCurrencies(@Query("apikey") String apiKey);

    @GET("live")
    Call<CurrencyRate> getCurrencyRates(@Query("apikey") String apiKey);
}
