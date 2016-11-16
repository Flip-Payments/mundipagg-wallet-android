package com.mundipagg.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by JGabrielFreitas on 16/11/16.
 */

public class Error {

    @SerializedName("card.number") private List<String> cardNumber;

}
