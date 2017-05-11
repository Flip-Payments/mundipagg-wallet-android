package com.mundipagg;


/**
 * Created by JGabrielFreitas on 26/09/16.
 */
public class MundipaggAccount {

    private String accessToken = null;
    private String customerId = null;

    private static MundipaggAccount ourInstance = new MundipaggAccount();

    public static MundipaggAccount getInstance() {
        return ourInstance;
    }

    private MundipaggAccount() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getCustomerId() {
        if (customerId == null) {
            throw new NullPointerException("customerId == null");
        }
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
