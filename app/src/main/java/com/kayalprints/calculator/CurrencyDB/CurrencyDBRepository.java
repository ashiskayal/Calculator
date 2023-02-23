package com.kayalprints.calculator.CurrencyDB;

import android.app.Application;
import android.database.sqlite.SQLiteConstraintException;
import android.util.Log;

import androidx.lifecycle.LiveData;

import com.kayalprints.calculator.Currency;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CurrencyDBRepository {
    private final CurrencyDAO currencyDAO;
    ExecutorService executors;

    public CurrencyDBRepository(Application application) {
        CurrencyDatabase database = CurrencyDatabase.getInstance(application);
        this.currencyDAO = database.getDao();
        this.executors = Executors.newSingleThreadExecutor();
    }

    public void insert(Currency currency) {
        executors.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    currencyDAO.insert(currency);
                } catch (SQLiteConstraintException e) {
                    Log.d("callingAPI", "Tyring to duplicate insert, Name = "+currency.getName()+", value = "+currency.getValue()+", fullName = "+currency.getFullName());
                    update(currency);
                }
            }
        });

    }

    public void update(Currency currency) {

        executors.execute(new Runnable() {
            @Override
            public void run() {
                currencyDAO.update(currency);
            }
        });
    }

    public void delete(Currency currency) {
        executors.execute(new Runnable() {
            @Override
            public void run() {
                currencyDAO.delete(currency);
            }
        });
    }

    public LiveData<List<Currency>> getCurrency(String name) {
        return currencyDAO.getCurrency(name);
    }

    public LiveData<List<Currency>> getAllCurrencies() {
        return currencyDAO.getAllCurrencies();
    }
}
