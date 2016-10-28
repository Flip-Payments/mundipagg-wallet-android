package com.mundipagg.api;

import android.content.Context;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */

public abstract class ServiceLayer {

    protected Context context;
    private boolean doInBackground = false;

    public ServiceLayer(Context context) {
        this.context = context;
    }

    public boolean isWorkInBackground() {
        return doInBackground;
    }

    public void enableBackground() {
        this.doInBackground = true;
    }
}
