package com.kayalprints.calculator.CurrencyDB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

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
//                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }


//    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
//        @Override
//        public void onCreate(@NonNull SupportSQLiteDatabase db) {
//            super.onCreate(db);
//
//            CurrencyDAO noteDao = instance.getDao();
//            ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            });
//        }
//    };
}
