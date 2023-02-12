package com.kayalprints.calculator.classes;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.kayalprints.calculator.BR;

public class CurrentInputHolder extends BaseObservable {

    private String result;
    private String hist;

    public CurrentInputHolder(String result, String hist) {
        this.result = result;
        this.hist = hist;
    }

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    @Bindable
    public String getHist() {
        return hist;
    }

    public void setHist(String hist) {
        this.hist = hist;
        notifyPropertyChanged(BR.hist);
    }
}
