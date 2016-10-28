package com.mundipagg.walletdemo.activities;

import com.jgabrielfreitas.core.activity.BaseActivity;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public class DemoBaseActivity extends BaseActivity {

    @Override
    public void doIntent(Class<?> classToIntent) {
        killAfterIntent = false;
        super.doIntent(classToIntent);
    }
}
