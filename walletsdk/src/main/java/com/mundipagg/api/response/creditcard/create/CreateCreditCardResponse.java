package com.mundipagg.api.response.creditcard.create;

import com.google.gson.annotations.SerializedName;
import com.mundipagg.api.ResponseBase;
import com.mundipagg.api.creditcard.NewCreditCard;

/**
 * Created by JGabrielFreitas on 16/11/16.
 */

public class CreateCreditCardResponse extends ResponseBase<NewCreditCard> {
    @SerializedName("id")
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}