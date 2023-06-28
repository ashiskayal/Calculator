package com.kayalprints.calculator.unitConvertor.roomDB;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.kayalprints.calculator.Unit;

import java.util.List;

public class UnitDBViewModel extends AndroidViewModel {

    private final UnitDBRepository repository;

    public UnitDBViewModel(@NonNull FragmentActivity activity) {
        super(activity.getApplication());
        this.repository = new UnitDBRepository(activity.getApplication());
    }

    public void insert(@NonNull Unit unit) {
        repository.insert(unit);
    }

    public void update(Unit unit) {
        repository.update(unit);
    }

    public void delete(Unit unit) {
        repository.delete(unit);
    }

    public LiveData<List<Unit>> getAllUnits() {
        return repository.getAllUnits();
    }

    public Unit getUnit(long id) { return repository.getUnit(id); }

    public LiveData<List<Unit>> getUnitByCategory(String category) { return repository.getUnitByCategory(category); }

    public LiveData<List<String>> getAllCategories() { return repository.getAllCategories(); }
}
