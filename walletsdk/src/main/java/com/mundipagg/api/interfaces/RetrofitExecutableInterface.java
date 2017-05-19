package com.mundipagg.api.interfaces;

import retrofit2.Call;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public interface RetrofitExecutableInterface<T> {

    void setExecutable(Call<T> api);
}
