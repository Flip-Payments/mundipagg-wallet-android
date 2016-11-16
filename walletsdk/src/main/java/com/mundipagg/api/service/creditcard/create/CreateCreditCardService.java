package com.mundipagg.api.service.creditcard.create;

import com.mundipagg.api.creditcard.NewCreditCard;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by JGabrielFreitas on 16/11/16.
 */

public interface CreateCreditCardService {

    @Headers("Authorization: Basic c2tfdGVzdF9BMGJrd2J2RkUydU9sV1lFOg==")
    @POST("core/v1.0/customers/{CUSTOMER_ID}/credit_cards")
    Call<CreditCardListResponse> create(@Path("CUSTOMER_ID") String customerId, @Body NewCreditCard newCreditCard);

}
