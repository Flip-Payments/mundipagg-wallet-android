package com.mundipagg.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JGabrielFreitas on 25/10/16.
 */

public abstract class ResponseBase {

    @SerializedName("message") private String message;

    public String getMessage() {
        return message;
    }
}
