package com.mundipagg.api.service.creditcard.list;

import android.content.Context;

import com.mundipagg.R;
import com.mundipagg.api.RetrofitConsumer;
import com.mundipagg.api.ServiceLayer;
import com.mundipagg.api.interfaces.RetrofitCallbackInterface;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;

import retrofit2.Response;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public class CreditCardServiceLayer extends ServiceLayer {

    public CreditCardServiceLayer(Context context) {
        super(context);
    }

    public void getCreditCards(CreditCardListCallbackInterface callbackInterface) {

        String customerId = "cus_G2gE9gdipSGalVYJ";

        RetrofitConsumer<CreditCardListResponse> retrofitConsumer = new RetrofitConsumer<>(context);
        CreditCardService service = retrofitConsumer.getRetrofit().create(CreditCardService.class);

        if (!isWorkInBackground()) {
            retrofitConsumer.setDialogMessage(context.getString(R.string.msg_loading_cards));
            retrofitConsumer.setWorkInBackground(isWorkInBackground());
        }

        retrofitConsumer.setExecutable(service.getCreditCards(customerId));
        retrofitConsumer.setRetrofitCallback(callbackInterface);
        retrofitConsumer.run();
    }

}
