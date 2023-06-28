
package com.kayalprints.calculator.currencyConvertor.db.retrofit.model.live;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyRate {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("quotes")
    @Expose
    private Quotes quotes;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Quotes getQuotes() {
        return quotes;
    }

    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }
}
