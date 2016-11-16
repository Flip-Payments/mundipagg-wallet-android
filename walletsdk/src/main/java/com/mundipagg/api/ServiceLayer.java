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

    public ServiceLayer(Context context, boolean disableFeedback) {
        this.context = context;
        if (disableFeedback)
            disableFeedback();
    }

    public boolean isWorkInBackground() {
        return doInBackground;
    }

    public void disableFeedback() {
        this.doInBackground = true;
    }
}
