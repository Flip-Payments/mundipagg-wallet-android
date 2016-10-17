package com.mundipagg;


/**
 * Created by JGabrielFreitas on 26/09/16.
 */
public class MundipaggAccount {

    private String accessToken;

    private static MundipaggAccount ourInstance = new MundipaggAccount();

    /**
     *
     * */
    public static MundipaggAccount getInstance() {
        return ourInstance;
    }

    private MundipaggAccount() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
