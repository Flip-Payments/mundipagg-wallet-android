package com.mundipagg.api.creditcard;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jcosilva on 31/05/2017.
 */

class Options {
    @SerializedName("verify_card")
    private boolean verifyCard = false;

    void setVerifyCard(boolean verifyCard) {
        this.verifyCard = verifyCard;
    }
}
