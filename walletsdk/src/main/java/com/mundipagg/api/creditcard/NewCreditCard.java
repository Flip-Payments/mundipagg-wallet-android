package com.mundipagg.api.creditcard;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JGabrielFreitas on 16/11/16.
 */

public class NewCreditCard extends CreditCardModel {

    @SerializedName("number")
    private String number;
    @SerializedName("cvv")
    private String securityCode;
    @SerializedName("options")
    private Options options;

    public NewCreditCard() {
        options = new Options();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number.replaceAll("\\s+", "");
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public void verifyCard(boolean isToVerify) {
        options.setVerifyCard(isToVerify);
    }
}
