package com.mundipagg.walletdemo;

import com.jgabrielfreitas.permissions.core.application.CorePermissionsApplication;
import com.mundipagg.MundipaggAccount;

/**
 * Created by JGabrielFreitas on 26/09/16.
 */

public class DemoApplication extends CorePermissionsApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        // MundipaggWallet.init("VjnlLyaMJmGpRKAzL02ypojdwVMalRX3Bn8P1xdbyM3w5J0Gj2mo7rZEXqPgywrU5h38ev8aBALnVWK4RpOkNlz6Q91G69Qxr5bm7OZKAE4kJWNqv603x192wNOZqozW");
        MundipaggAccount.getInstance().setCustomerId("cus_MQN3g7BsQUOO3Abd");
    }
}
