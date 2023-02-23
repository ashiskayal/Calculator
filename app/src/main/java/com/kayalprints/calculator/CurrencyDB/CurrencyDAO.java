package com.kayalprints.calculator.CurrencyDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.kayalprints.calculator.Currency;

import java.util.List;

@Dao
public interface CurrencyDAO {

    @Insert
    void insert(Currency currency);

    @Update
    void update(Currency currency);

    @Delete
    void delete(Currency currency);

    @Query("SELECT * FROM currency where currency_name=:name limit 1")
    LiveData<List<Currency>> getCurrency(String name);

    @Query("SELECT * FROM currency")
    LiveData<List<Currency>> getAllCurrencies();
}
