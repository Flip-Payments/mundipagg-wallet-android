package com.mundipagg.api;

import android.app.ProgressDialog;
import android.content.Context;

import com.mundipagg.api.interfaces.RetrofitCallback;
import com.mundipagg.api.interfaces.RetrofitExecutableInterface;
import com.mundipagg.util.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.mundipagg.BuildConfig.URL_API;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public final class RetrofitConsumer<T> implements RetrofitExecutableInterface<T> {

    boolean workInBackground = true;
    Context context;
    private ProgressDialog dialog;
    private String dialogMessage;
    private String dialogTitle;
    private RetrofitCallback retrofitCallback;
    Retrofit retrofit;
    Call<T> api;
    private int responseCode;

    public RetrofitConsumer(Context context) {
        this.context = context;
        retrofit = Utils.createRetrofit(URL_API);
    }

    public RetrofitConsumer(Context context, String url) {
        this.context = context;
        retrofit = Utils.createRetrofit(url);
    }

    private void executeFeedback() {

        if (!workInBackground && context != null)
            dialog = ProgressDialog.show(context, dialogTitle, dialogMessage, false, false);
    }

    public void setRetrofitCallback(RetrofitCallback<T> retrofitCallback) {
        this.retrofitCallback = retrofitCallback;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public void setWorkInBackground(boolean workInBackground) {
        this.workInBackground = workInBackground;
    }

    public void setDialogMessage(String dialogMessage) {
        this.dialogMessage = dialogMessage;
    }

    public void setDialogTitle(String dialogTitle) {
        this.dialogTitle = dialogTitle;
    }

    public void setExecutable(Call<T> api) {
        this.api = api;
    }

    public void run() {

        executeFeedback();
        if (retrofitCallback != null)
            api.enqueue(new Callback<T>() {
                @Override
                public void onResponse(Call<T> call, Response<T> response) {

                    responseCode = response.code();

                    if (responseCode <= 202)
                        retrofitCallback.onSuccess(response.body());
                    else
                        retrofitCallback.responseServerError(response.body(), response);

                    tryCloseDialog();
                }

                @Override
                public void onFailure(Call<T> call, Throwable t) {
                    retrofitCallback.onError(t);
                    tryCloseDialog();
                }

            });
    }

    private void tryCloseDialog() {

        try {

            if (dialog != null)
                if (dialog.isShowing())
                    dialog.dismiss();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getResponseCode() {
        return responseCode;
    }
}
