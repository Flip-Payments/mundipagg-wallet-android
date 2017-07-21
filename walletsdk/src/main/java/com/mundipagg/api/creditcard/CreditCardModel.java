package com.mundipagg.api.creditcard;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JGabrielFreitas on 16/11/16.
 */

public abstract class CreditCardModel {

    @SerializedName("holder_name")      private String holderName;
    @SerializedName("exp_month")        private int    expMonth;
    @SerializedName("exp_year")         private int    expYear;
    @SerializedName("billing_address")  private BillingAddress billingAddress;
    @SerializedName("holder_document")  private String holderDocument;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getHolderDocument() {
        return holderDocument;
    }

    public void setHolderDocument(String holderDocument) {
        this.holderDocument = holderDocument;
    }
}
