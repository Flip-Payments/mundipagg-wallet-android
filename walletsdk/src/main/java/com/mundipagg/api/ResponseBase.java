package com.mundipagg.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JGabrielFreitas on 25/10/16.
 */

public abstract class ResponseBase<T> {

    @SerializedName("message")  private String message;
    @SerializedName("response") private T      response;
    @SerializedName("errors")   private Error  errors;

    public String getMessage() {
        return message;
    }

    public T getResponse() {
        return response;
    }

    public Error getErrors() {
        return errors;
    }
}
