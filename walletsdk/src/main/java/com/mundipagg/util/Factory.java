package com.mundipagg.util;


import com.mundipagg.BuildConfig;
import com.mundipagg.MundipaggAccount;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static retrofit2.converter.gson.GsonConverterFactory.create;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public class Factory {

    public static Retrofit createRetrofit() {
        // create interceptor to show all request and response in log (for debug)
        Builder builder = new Builder();
        builder.readTimeout(60, SECONDS);
        builder.writeTimeout(60, SECONDS);

        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()
                        .header("Authorization", "Basic " + MundipaggAccount.getInstance().getAccessToken())
                        .method(chain.request().method(), chain.request().body())
                        .build();
                return chain.proceed(request);
            }
        });
        OkHttpClient okHttpClient = builder.build();

        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BuildConfig.URL_API)
                .addConverterFactory(create())
                .build();
    }
}
