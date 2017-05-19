package com.mundipagg.api.interfaces;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public interface RetrofitCallback<T> {

    // response code 200, 201..
    void onSuccess(T response);

    void onError(Throwable t);
}