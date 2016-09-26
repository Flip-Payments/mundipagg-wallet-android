package com.mundipagg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import static android.content.pm.PackageManager.GET_META_DATA;

/**
 * Created by JGabrielFreitas on 26/09/16.
 */

public class MundipaggWallet {

    public static void init(Context context) {

        // configure mundipagg account
        MundipaggAccount.getInstance().setAccessToken(getAccessToken(context));

        Log.e("MundipaggAccount", MundipaggAccount.getInstance().toString());
    }

    private static String getAccessToken(Context context) {

        try {

            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), GET_META_DATA);
            return (String) applicationInfo.metaData.get("MundipaggAccount");

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
