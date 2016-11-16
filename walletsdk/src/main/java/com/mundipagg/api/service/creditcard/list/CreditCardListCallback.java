package com.mundipagg.api.service.creditcard.list;

import com.mundipagg.api.interfaces.RetrofitCallback;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;

import retrofit2.Response;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public interface CreditCardListCallback extends RetrofitCallback<CreditCardListResponse> {

    @Override
    void onSuccess(CreditCardListResponse response);

    @Override
    void responseServerError(CreditCardListResponse object, Response<CreditCardListResponse> response);

    @Override
    void onError(Throwable t);
}
