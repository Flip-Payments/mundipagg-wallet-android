package com.mundipagg.util;


import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import retrofit2.Retrofit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static retrofit2.converter.gson.GsonConverterFactory.create;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public class Utils {

    public static Retrofit createRetrofit(String URL) {

        // create interceptor to show all request and response in log (for debug)
        Builder builder = new Builder();
        builder.readTimeout(60, SECONDS);
        builder.writeTimeout(60, SECONDS);

        OkHttpClient okHttpClient = builder.build();

        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(URL)
                .addConverterFactory(create())
                .build();
    }
}
