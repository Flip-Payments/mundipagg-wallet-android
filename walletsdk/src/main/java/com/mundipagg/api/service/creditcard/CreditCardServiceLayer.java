package com.mundipagg.api.service.creditcard;

import com.mundipagg.api.RetrofitConsumer;
import com.mundipagg.api.ServiceLayer;
import com.mundipagg.api.creditcard.NewCreditCard;
import com.mundipagg.api.response.creditcard.create.CreateCreditCardResponse;
import com.mundipagg.api.response.creditcard.delete.CreditCardDeleteResponse;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;
import com.mundipagg.api.service.creditcard.create.CreateCreditCardCallback;
import com.mundipagg.api.service.creditcard.create.CreateCreditCardService;
import com.mundipagg.api.service.creditcard.delete.DeleteCreditCardCallback;
import com.mundipagg.api.service.creditcard.delete.DeleteCreditCardService;
import com.mundipagg.api.service.creditcard.list.CreditCardListCallback;
import com.mundipagg.api.service.creditcard.list.CreditCardService;

import static com.mundipagg.MundipaggAccount.getInstance;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public class CreditCardServiceLayer extends ServiceLayer {

    public CreditCardServiceLayer() {
    }

    public void getAllCreditCards(CreditCardListCallback callbackInterface) {

        RetrofitConsumer<CreditCardListResponse> retrofitConsumer = new RetrofitConsumer<>();
        CreditCardService service = retrofitConsumer.getRetrofit().create(CreditCardService.class);

        try {
            retrofitConsumer.setExecutable(service.getCreditCards(getInstance().getCustomerId()));
            retrofitConsumer.setRetrofitCallback(callbackInterface);
            retrofitConsumer.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void create(NewCreditCard newCreditCard, CreateCreditCardCallback callbackInterface) {

        RetrofitConsumer<CreateCreditCardResponse> retrofitConsumer = new RetrofitConsumer<>();
        CreateCreditCardService service = retrofitConsumer.getRetrofit().create(CreateCreditCardService.class);

        try {
            retrofitConsumer.setExecutable(service.create(getInstance().getCustomerId(), newCreditCard));
            retrofitConsumer.setRetrofitCallback(callbackInterface);
            retrofitConsumer.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String creditCardId, DeleteCreditCardCallback callbackInterface) {
        RetrofitConsumer<CreditCardDeleteResponse> retrofitConsumer = new RetrofitConsumer<>();
        DeleteCreditCardService service = retrofitConsumer.getRetrofit().create(DeleteCreditCardService.class);

        try {
            retrofitConsumer.setExecutable(service.delete(getInstance().getCustomerId(), creditCardId));
            retrofitConsumer.setRetrofitCallback(callbackInterface);
            retrofitConsumer.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
