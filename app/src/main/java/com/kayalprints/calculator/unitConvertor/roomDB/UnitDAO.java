package com.kayalprints.calculator.unitConvertor.roomDB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.kayalprints.calculator.Unit;

import java.util.List;

@Dao
public interface UnitDAO {

    @Insert
    void insert(Unit unit);

    @Update
    void update(Unit unit);

    @Delete
    void delete(Unit unit);

    @Query("SELECT * FROM unit where primary_key=:id limit 1")
    LiveData<List<Unit>> getUnit(long id);

    @Query("SELECT * FROM unit")
    LiveData<List<Unit>> getAllUnits();

    @Query("SELECT * FROM unit where unit_category=:category order by unit_full_name")
    LiveData<List<Unit>> getUnitByCategory(String category);

    @Query("SELECT distinct unit_category FROM unit order by unit_category")
    LiveData<List<String>> getAllCategories();

}