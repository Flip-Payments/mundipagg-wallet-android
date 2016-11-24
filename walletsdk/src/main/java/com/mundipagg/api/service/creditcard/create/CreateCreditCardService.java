package com.mundipagg.api.service.creditcard.create;

import com.mundipagg.api.creditcard.NewCreditCard;
import com.mundipagg.api.response.creditcard.create.CreateCreditCardResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by JGabrielFreitas on 16/11/16.
 */

public interface CreateCreditCardService {

    @Headers("Authorization: Basic c2tfeGxQYlpvSHZBSDQ2NzVXSjo=")
    @POST("core/v1.0/customers/{CUSTOMER_ID}/credit_cards")
    Call<CreateCreditCardResponse> create(@Path("CUSTOMER_ID") String customerId, @Body NewCreditCard newCreditCard);

    @Headers("Authorization: Basic c2tfeGxQYlpvSHZBSDQ2NzVXSjo=")
    @POST("core/v1.0/customers/{CUSTOMER_ID}/credit_cards")
    Observable<CreateCreditCardResponse> createRx(@Path("CUSTOMER_ID") String customerId, @Body NewCreditCard newCreditCard);

}
