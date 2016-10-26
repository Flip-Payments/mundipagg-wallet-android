package com.mundipagg.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JGabrielFreitas on 25/10/16.
 */

public class Page {

    @SerializedName("total_items")  private Integer totalItems;
    @SerializedName("current_page") private Integer currentPage;
    @SerializedName("total_pages")  private Integer totalPages;

    public Integer getTotalItems() {
        return totalItems;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getTotalPages() {
        return totalPages;
    }
}
