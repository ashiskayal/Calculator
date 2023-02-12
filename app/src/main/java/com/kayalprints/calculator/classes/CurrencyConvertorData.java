package com.kayalprints.calculator.classes;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.kayalprints.calculator.BR;


public class CurrencyConvertorData extends BaseObservable {
    private String fromCurrency, toCurrency;
    private double valueFromCurrency, valueToCurrency, result;

    public CurrencyConvertorData() {}

    public CurrencyConvertorData(String fromCurrency, String toCurrency, double valueFromCurrency, double valueToCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.valueFromCurrency = valueFromCurrency;
        this.valueToCurrency = valueToCurrency;
    }

    @Bindable
    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
        notifyPropertyChanged(BR.fromCurrency);
    }

    @Bindable
    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
        notifyPropertyChanged(BR.toCurrency);
    }

    @Bindable
    public String getResult() {
        return String.valueOf(result);
    }

    public void setResult(double result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    @Bindable
    public String getValueFromCurrency() {
        return String.valueOf(valueFromCurrency);
    }

    public void setValueFromCurrency(String valueFromCurrency) {
        this.valueFromCurrency = Double.parseDouble(valueFromCurrency);
        notifyPropertyChanged(BR.valueFromCurrency);
    }

    @Bindable
    public String getValueToCurrency() {
        return String.valueOf(valueToCurrency);
    }

    public void setValueToCurrency(String valueToCurrency) {
        this.valueToCurrency = Double.parseDouble(valueToCurrency);
        notifyPropertyChanged(BR.valueToCurrency);
    }
}
