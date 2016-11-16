package com.mundipagg.walletdemo.activities;

import com.jgabrielfreitas.core.activity.BaseActivity;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public class DemoBaseActivity extends BaseActivity {

    @Override
    public void doIntent(Class<?> classToIntent) {
        killAfterIntent = false;
        super.doIntent(classToIntent);
    }

    public void toast(String message) {
        makeText(this, message, LENGTH_SHORT).show();
    }

}
