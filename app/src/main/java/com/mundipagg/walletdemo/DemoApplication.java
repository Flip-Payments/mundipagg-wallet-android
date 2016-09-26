package com.mundipagg.walletdemo;

import android.app.Application;

import com.mundipagg.MundipaggWallet;

/**
 * Created by JGabrielFreitas on 26/09/16.
 */

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MundipaggWallet.init(this);
    }
}
