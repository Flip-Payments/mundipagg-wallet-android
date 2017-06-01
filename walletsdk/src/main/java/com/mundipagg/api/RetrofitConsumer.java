package com.mundipagg.api;

import com.mundipagg.MundipaggAccount;
import com.mundipagg.api.exceptions.CardVerificationException;
import com.mundipagg.api.interfaces.RetrofitCallback;
import com.mundipagg.api.interfaces.RetrofitExecutableInterface;
import com.mundipagg.util.Factory;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public final class RetrofitConsumer<T> implements RetrofitExecutableInterface<T> {

    private RetrofitCallback retrofitCallback;
    Retrofit retrofit;
    Call<T> api;

    public RetrofitConsumer() {
        retrofit = Factory.createRetrofit();
    }

    public void setRetrofitCallback(RetrofitCallback<T> retrofitCallback) {
        this.retrofitCallback = retrofitCallback;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }


    public void setExecutable(Call<T> api) {
        this.api = api;
    }

    public void run() {
        if (MundipaggAccount.getInstance().getAccessToken() == null) {
            throw new NullPointerException("Token == null, need call MundiPaggWallet.init(token)");
        }
        if (retrofitCallback == null) {
            throw new NullPointerException("Callback == null, have you set a callback?");
        }
        api.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (response.code() >= 200 && response.code() < 300) {
                    retrofitCallback.onSuccess(response.body());
                } else if (response.code() == 412) {
                    retrofitCallback.onError(new CardVerificationException("Could not create credit card. The card verification failed."));
                } else {
                    retrofitCallback.onError(new Throwable(response.message()));
                }
                
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                retrofitCallback.onError(t);
                t.printStackTrace();
            }
        });
    }
}
