package com.kayalprints.calculator;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;


public class CurrencyConvertorData extends BaseObservable {
    private Currency fromCurrency, toCurrency;
    private double ratio;
    private String currentFromValue, currentToValue;
    private int fromCurrencyCallCount, toCurrencyCallCount;  // This flags is used to prevent the recursive call of setCurrentFromValue & setCurrentFromValue

    public CurrencyConvertorData(Currency fromCurrency, Currency toCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.fromCurrencyCallCount = 0;
        this.toCurrencyCallCount = 0;
        initializeValues();
    }

    @Bindable
    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
        initializeValues();
        notifyPropertyChanged(BR.fromCurrency);
        notifyPropertyChanged(BR.currentFromValue);
        notifyPropertyChanged(BR.currentToValue);
    }

    @Bindable
    public Currency getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(Currency toCurrency) {
        this.toCurrency = toCurrency;
        initializeValues();
        notifyPropertyChanged(BR.toCurrency);
        notifyPropertyChanged(BR.currentFromValue);
        notifyPropertyChanged(BR.currentToValue);
    }

    @Bindable
    public String getCurrentFromValue() {
        return currentFromValue;
    }

    public void setCurrentFromValue(@NonNull String currentFromValue) {
        fromCurrencyCallCount++;
        this.currentFromValue = currentFromValue;
        try {
            if(fromCurrencyCallCount > toCurrencyCallCount) {
                currentToValue = (Double.parseDouble(this.currentFromValue)*ratio)+"";
//                currentToValue = String.format(new Locale("English","India"),"%.4f",Double.parseDouble(this.currentFromValue)*ratio);
                notifyPropertyChanged(BR.currentToValue);
            }
        } catch (NumberFormatException e) {
            currentToValue = "0.0";
            notifyPropertyChanged(BR.currentToValue);
        } // When currentFromValue is empty then it causes exception

        notifyPropertyChanged(BR.currentFromValue);
    }

    @Bindable
    public String getCurrentToValue() {
        return currentToValue;
    }

    public void setCurrentToValue(@NonNull String currentToValue) {
        toCurrencyCallCount++;
        this.currentToValue = currentToValue;
        try {
            if(fromCurrencyCallCount < toCurrencyCallCount) {
                currentFromValue = (Double.parseDouble(this.currentToValue)/ratio)+"";
//                currentFromValue = String.format(new Locale("English","India"),"%.4f",(Double.parseDouble(this.currentToValue)/ratio));
                notifyPropertyChanged(BR.currentFromValue);
            }
        } catch (NumberFormatException e) {
            currentFromValue = "0.0";
            notifyPropertyChanged(BR.currentFromValue);
        } // When currentToValue is empty then it causes exception

        notifyPropertyChanged(BR.currentToValue);
    }

    private void initializeValues() {
        this.ratio = this.toCurrency.getValue() / this.fromCurrency.getValue();
        this.currentFromValue = "1";
        this.currentToValue = (Double.parseDouble(currentFromValue)*ratio)+"";
//        this.currentToValue = String.format(new Locale("English","India"),"%.4f",(Double.parseDouble(currentFromValue)*ratio));
    }
}