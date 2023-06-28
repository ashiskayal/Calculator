
package com.kayalprints.calculator.currencyConvertor.db.retrofit.model.list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyList {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("currencies")
    @Expose
    private Currencies currencies;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Currencies getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }

}
