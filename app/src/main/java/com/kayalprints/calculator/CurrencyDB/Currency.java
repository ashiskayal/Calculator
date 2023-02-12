package com.kayalprints.calculator.CurrencyDB;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "currency")
public class Currency {

    @ColumnInfo(name = "currency_name")
    @PrimaryKey()
    @NonNull
    private String name;

    @ColumnInfo(name = "currency_value")
    private double value;

    @ColumnInfo(name = "currency_full_name")
    private String fullName;

    public Currency () {
        name = "";
    }

    @Ignore
    public Currency(@NonNull String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Ignore
    public Currency(@NonNull String name, double value, String fullName) {
        this.name = name;
        this.value = value;
        this.fullName = fullName;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}