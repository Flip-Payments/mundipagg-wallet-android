package com.mundipagg.api.service.creditcard.create;

import com.mundipagg.api.creditcard.NewCreditCard;
import com.mundipagg.api.response.creditcard.create.CreateCreditCardResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by JGabrielFreitas on 16/11/16.
 */

public interface CreateCreditCardService {

    @POST("core/v1/customers/{CUSTOMER_ID}/cards")
    Call<CreateCreditCardResponse> create(@Path("CUSTOMER_ID") String customerId, @Body NewCreditCard newCreditCard);
}
