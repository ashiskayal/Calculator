package com.kayalprints.calculator;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class UnitConvertorData extends BaseObservable {
    private Unit fromUnit, toUnit;
    private double ratio;
    private String currentFromValue, currentToValue;
    private int fromUnitCallCount, toUnitCallCount;  // This flags is used to prevent the recursive call of setCurrentFromValue & setCurrentFromValue
    private String category;

    public UnitConvertorData(String category) { // Here category can be null
        this.category = category;
        this.fromUnitCallCount = 0;
        this.toUnitCallCount = 0;
        // Initialize the fromUnit and toUnit according to the category
    }

    @Bindable
    public Unit getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(Unit fromUnit) {
        this.fromUnit = fromUnit;
        if(this.toUnit == null) {
            this.toUnit = fromUnit;
            notifyPropertyChanged(BR.toUnit);
        }
        initializeValues();
        notifyPropertyChanged(BR.fromUnit);
        notifyPropertyChanged(BR.currentFromValue);
        notifyPropertyChanged(BR.currentToValue);
    }

    @Bindable
    public Unit getToUnit() {
        return toUnit;
    }

    public void setToUnit(Unit toUnit) {
        this.toUnit = toUnit;
        if(this.fromUnit == null) {
            this.fromUnit = toUnit;
            notifyPropertyChanged(BR.fromUnit);
        }
        initializeValues();
        notifyPropertyChanged(BR.toUnit);
        notifyPropertyChanged(BR.currentFromValue);
        notifyPropertyChanged(BR.currentToValue);
    }

    @Bindable
    public String getCurrentFromValue() {
        return currentFromValue;
    }

    public void setCurrentFromValue(@NonNull String currentFromValue) {
        fromUnitCallCount++;
        this.currentFromValue = currentFromValue;
        try {
            if(fromUnitCallCount > toUnitCallCount) {
                currentToValue = (Double.parseDouble(this.currentFromValue)*ratio)+"";
//                currentToValue = String.format(new Locale("English","India"),"%.4f",Double.parseDouble(this.currentFromValue)*ratio);
                notifyPropertyChanged(BR.currentToValue);
            }
        } catch (NumberFormatException e) {
            currentToValue = "0";
            notifyPropertyChanged(BR.currentToValue);
        } // When currentFromValue is empty then it causes exception

        notifyPropertyChanged(BR.currentFromValue);
    }

    @Bindable
    public String getCurrentToValue() {
        return currentToValue;
    }

    public void setCurrentToValue(@NonNull String currentToValue) {
        toUnitCallCount++;
        this.currentToValue = currentToValue;
        try {
            if(fromUnitCallCount < toUnitCallCount) {
                currentFromValue = (Double.parseDouble(this.currentToValue)/ratio)+"";
//                currentFromValue = String.format(new Locale("English","India"),"%.4f",(Double.parseDouble(this.currentToValue)/ratio));
                notifyPropertyChanged(BR.currentFromValue);
            }
        } catch (NumberFormatException e) {
            currentFromValue = "0";
            notifyPropertyChanged(BR.currentFromValue);
        } // When currentToValue is empty then it causes exception

        notifyPropertyChanged(BR.currentToValue);
    }

    @Bindable
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
        notifyPropertyChanged(BR.category);
    }

    private void initializeValues() {
        this.ratio = this.toUnit.getValue() / this.fromUnit.getValue();
        this.currentFromValue = "1";
        this.currentToValue = (Double.parseDouble(currentFromValue)*ratio)+"";
//        this.currentToValue = String.format(new Locale("English","India"),"%.4f",(Double.parseDouble(currentFromValue)*ratio));
    }
}