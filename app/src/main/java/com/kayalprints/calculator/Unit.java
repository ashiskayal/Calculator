package com.kayalprints.calculator;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "unit")
public class Unit {

    @ColumnInfo(name = "unit_name")
    @NonNull
    private String name;

    @ColumnInfo(name = "unit_full_name")
    @NonNull
    private String fullName;

    @ColumnInfo(name = "unit_value")
    private double value;

    @ColumnInfo(name = "unit_category")
    @NonNull
    private String category;

    @ColumnInfo(name = "primary_key")
    @PrimaryKey
    private long pkey;


    public Unit () {
        this.name = "";
        this.category = "";
        this.fullName = "";
    }
/*
    @Ignore
    public Unit(@NonNull String name, double value) {
        this.name = name;
        this.value = value;
        this.category = name;
        this.fullName = name;
        this.pkey = this.name.hashCode()+this.category.hashCode();
    }

    @Ignore
    public Unit(@NonNull String name, double value, @NonNull String fullName) {
        this.name = name;
        this.value = value;
        this.fullName = fullName;
        this.category = name;
        this.pkey = this.name.hashCode()+this.category.hashCode();
    }

    @Ignore
    public Unit(@NonNull String name, @NonNull String fullName) {
        this.name = name;
        this.fullName = fullName;
        this.category = name;
        this.pkey = this.name.hashCode()+this.category.hashCode();
    }
*/

    public Unit(@NonNull String name, @NonNull String fullName, double value, @NonNull String category) {
        this.name = name;
        this.fullName = fullName;
        this.value = value;
        this.category = category;
        this.pkey = name.hashCode()+category.hashCode();
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
        this.pkey = this.name.hashCode()+this.category.hashCode();
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @NonNull
    public String getFullName() {
        return fullName;
    }

    public void setFullName(@NonNull String fullName) {
        this.fullName = fullName;
    }

    @NonNull
    public String getCategory() {
        return category;
    }

    public void setCategory(@NonNull String category) {
        this.category = category;
        this.pkey = this.name.hashCode()+this.category.hashCode();
    }

    public long getPkey() {
        return pkey;
    }

    public void setPkey(long pkey) {
        this.pkey = pkey;
    }

    @NonNull
    @Override
    public String toString() {
        return name+" : "+fullName;
    }
}
