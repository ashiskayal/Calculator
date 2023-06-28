package com.kayalprints.calculator.currencyConvertor.db.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.kayalprints.calculator.Currency;

@Database(entities = {Currency.class}, version = 1)
public abstract class CurrencyDatabase extends RoomDatabase {

    public static CurrencyDatabase instance;
    // Dao & Database Linking
    public abstract CurrencyDAO getDao();

    public static synchronized CurrencyDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext()
                            ,CurrencyDatabase.class,"currency_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
