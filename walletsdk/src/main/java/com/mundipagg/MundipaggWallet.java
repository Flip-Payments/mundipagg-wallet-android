package com.mundipagg;

/**
 * Created by JGabrielFreitas on 26/09/16.
 */

public class MundipaggWallet {
    public static void init(String token) {
        // configure mundipagg account
        MundipaggAccount.getInstance().setAccessToken(token);
    }
}
