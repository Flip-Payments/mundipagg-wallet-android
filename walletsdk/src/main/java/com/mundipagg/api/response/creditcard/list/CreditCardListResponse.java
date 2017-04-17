package com.mundipagg.api.response.creditcard.list;

import com.google.gson.annotations.SerializedName;
import com.mundipagg.annotations.CantBeNull;
import com.mundipagg.api.Page;
import com.mundipagg.api.ResponseBase;
import com.mundipagg.api.creditcard.CreditCardFromList;

import java.util.List;

/**
 * Created by JGabrielFreitas on 25/10/16.
 */

public class CreditCardListResponse extends ResponseBase<CreditCardFromList> {

    @SerializedName("data")    private List<CreditCardFromList> data;
    @SerializedName("paging")  private Page                     paging;

    @CantBeNull
    public List<CreditCardFromList> getData() {
        return data;
    }

    @CantBeNull
    public Page getPaging() {
        return paging;
    }
}

