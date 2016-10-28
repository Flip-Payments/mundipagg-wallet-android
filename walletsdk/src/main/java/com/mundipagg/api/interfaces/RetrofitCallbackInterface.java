package com.mundipagg.api.interfaces;

import retrofit2.Response;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public interface RetrofitCallbackInterface<T> {

    // response code 200, 201..
    void onSuccess(T response);

    // 400, 404, 500..
    void responseServerError(T object, Response<T> response);

    void onError(Throwable t);
}