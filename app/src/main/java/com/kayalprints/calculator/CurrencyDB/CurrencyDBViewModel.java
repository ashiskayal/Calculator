package com.kayalprints.calculator.CurrencyDB;

import android.annotation.SuppressLint;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class CurrencyDBViewModel extends AndroidViewModel {

    private final CurrencyDBRepository repository;
    @SuppressLint("StaticFieldLeak")
    private final FragmentActivity activity;

    public CurrencyDBViewModel(@NonNull FragmentActivity activity) {
        super(activity.getApplication());
        this.activity = activity;
        this.repository = new CurrencyDBRepository(activity.getApplication());
    }

    public void insert(@NonNull Currency currency) {
//        repository.getCurrency(currency.getName()).observe(activity, currencies -> {
//            Log.d("callingAPI", "For Name = "+currency.getName()+"fullName = "+currency.getFullName());
//            if(currencies.size() == 1) repository.update(currency);
//            else repository.insert(currency);
//        });
        repository.insert(currency);
    }

    public void update(Currency currency) {
        repository.update(currency);
    }

    public void delete(Currency currency) {
        repository.delete(currency);
    }

    public LiveData<List<Currency>> getAllCurrencies() {
        return repository.getAllCurrencies();
    }
}
