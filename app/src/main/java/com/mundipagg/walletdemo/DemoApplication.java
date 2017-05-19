package com.mundipagg.walletdemo;

import com.jgabrielfreitas.permissions.core.application.CorePermissionsApplication;
import com.mundipagg.MundipaggAccount;
import com.mundipagg.MundipaggWallet;

/**
 * Created by JGabrielFreitas on 26/09/16.
 */

public class DemoApplication extends CorePermissionsApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        MundipaggWallet.init("AOw5bj6E03L8l9o7kMOG23r9gnLJa54djPvEKwm9nkYKBOJv7LoQbaWx8Ny3q4biECjX04dreA6ZMGwl1PzE5Rj2VgZ1l8RWYx7NBzQemb06yVAoe4zNVaMmGKJg21kd");
        MundipaggAccount.getInstance().setCustomerId("cus_3mP8v5qSVxClbKn2");
    }
}
