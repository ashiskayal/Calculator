package com.kayalprints.calculator.retrofit.currencyConvert.service;

import androidx.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyInstance {

    private static Retrofit retrofit;
    private final static String BASE_URL = "https://api.apilayer.com/currency_data/";

    @NonNull
    public static CurrencyService getCurrService() {
        if(retrofit == null)
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        return retrofit.create(CurrencyService.class);
    }

}
