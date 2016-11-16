package com.mundipagg.api.creditcard;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JGabrielFreitas on 16/11/16.
 */

public class NewCreditCard extends CreditCardModel {

    @SerializedName("number") private String number;
    @SerializedName("cvv")    private String securityCode;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
}
