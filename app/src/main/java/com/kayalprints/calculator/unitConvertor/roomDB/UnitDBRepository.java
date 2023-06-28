package com.kayalprints.calculator.unitConvertor.roomDB;

import android.app.Application;
import android.database.sqlite.SQLiteConstraintException;
import android.util.Log;

import androidx.lifecycle.LiveData;

import com.kayalprints.calculator.Unit;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnitDBRepository {
    private final UnitDAO unitDAO;
    ExecutorService executors;

    public UnitDBRepository(Application application) {
        UnitDatabase database = UnitDatabase.getInstance(application);
        this.unitDAO = database.getDao();
        this.executors = Executors.newSingleThreadExecutor();
    }

    public void insert(Unit unit) {
        executors.execute(() -> {
            try {
                unitDAO.insert(unit);
            } catch (SQLiteConstraintException e) {
                Log.d("callingAPI", "Tyring to duplicate insert, Name = "+unit.getName()+", value = "+unit.getValue()+", fullName = "+unit.getFullName()+", category = "+unit.getCategory());
                update(unit);
            }
        });
    }

    public void update(Unit unit) {
        executors.execute(() -> unitDAO.update(unit));
    }

    public void delete(Unit unit) {
        executors.execute(() -> unitDAO.delete(unit));
    }

    public Unit getUnit(long id) {
        List<Unit> result = unitDAO.getUnit(id).getValue();
        return (result != null && result.size()>0) ? result.get(0): null;
    }

    public LiveData<List<Unit>> getAllUnits() {
        return unitDAO.getAllUnits();
    }

    public LiveData<List<Unit>> getUnitByCategory(String category) {
        return unitDAO.getUnitByCategory(category);
    }

    public LiveData<List<String>> getAllCategories() {
        return unitDAO.getAllCategories();
    }
}
