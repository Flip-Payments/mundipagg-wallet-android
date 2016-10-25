package com.mundipagg.api.response.creditcard.list;

import com.google.gson.annotations.SerializedName;
import com.mundipagg.api.Page;
import com.mundipagg.api.ResponseBase;
import com.mundipagg.api.creditcard.CreditCard;

import java.util.List;

/**
 * Created by JGabrielFreitas on 25/10/16.
 */

public class CreditCardListResponse extends ResponseBase {

    @SerializedName("data")    private List<CreditCard> data;
    @SerializedName("paging")  private Page             paging;

    public List<CreditCard> getData() {
        return data;
    }

    public Page getPaging() {
        return paging;
    }
}
