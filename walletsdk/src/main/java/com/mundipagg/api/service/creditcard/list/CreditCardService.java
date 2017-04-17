package com.mundipagg.api.service.creditcard.list;

import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by JGabrielFreitas on 27/10/16.
 */

public interface CreditCardService {

    @GET("core/v1.0/customers/{CUSTOMER_ID}/credit_cards")
    Call<CreditCardListResponse> getCreditCards(@Path("CUSTOMER_ID") String customerId);
}
