package com.mundipagg.api.service.creditcard;

import android.content.Context;

import com.mundipagg.R;
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

    public CreditCardServiceLayer(Context context) {
        super(context);
    }

    public CreditCardServiceLayer(Context context, boolean disableFeedback) {
        super(context, disableFeedback);
    }

    public void getAllCreditCards(CreditCardListCallback callbackInterface) {

        RetrofitConsumer<CreditCardListResponse> retrofitConsumer = new RetrofitConsumer<>(context);
        CreditCardService service = retrofitConsumer.getRetrofit().create(CreditCardService.class);

        if (!isWorkInBackground()) {
            retrofitConsumer.setDialogMessage(context.getString(R.string.msg_loading_cards));
            retrofitConsumer.setWorkInBackground(isWorkInBackground());
        }

        retrofitConsumer.setExecutable(service.getCreditCards(getInstance().getCustomerId()));
        retrofitConsumer.setRetrofitCallback(callbackInterface);
        retrofitConsumer.run();
    }

    public void create(NewCreditCard newCreditCard, CreateCreditCardCallback callbackInterface) {

        RetrofitConsumer<CreateCreditCardResponse> retrofitConsumer = new RetrofitConsumer<>(context);
        CreateCreditCardService service = retrofitConsumer.getRetrofit().create(CreateCreditCardService.class);

        if (!isWorkInBackground()) {
            retrofitConsumer.setDialogMessage(context.getString(R.string.msg_creating_credit_card));
            retrofitConsumer.setWorkInBackground(isWorkInBackground());
        }

        retrofitConsumer.setExecutable(service.create(getInstance().getCustomerId(), newCreditCard));
        retrofitConsumer.setRetrofitCallback(callbackInterface);
        retrofitConsumer.run();
    }

    public void delete(String creditCardId, DeleteCreditCardCallback callbackInterface) {
        RetrofitConsumer<CreditCardDeleteResponse> retrofitConsumer = new RetrofitConsumer<>(context);
        DeleteCreditCardService service = retrofitConsumer.getRetrofit().create(DeleteCreditCardService.class);
        if (!isWorkInBackground()) {
            retrofitConsumer.setDialogMessage(context.getString(R.string.msg_deleting_credit_card));
            retrofitConsumer.setWorkInBackground(isWorkInBackground());
        }
        retrofitConsumer.setExecutable(service.delete(getInstance().getCustomerId(), creditCardId));
        retrofitConsumer.setRetrofitCallback(callbackInterface);
        retrofitConsumer.run();
    }
}
