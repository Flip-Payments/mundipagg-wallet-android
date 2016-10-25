package com.mundipagg.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JGabrielFreitas on 25/10/16.
 */

public class Page {

    @SerializedName("total_items")  private int totalItems;
    @SerializedName("current_page") private int currentPage;
    @SerializedName("total_pages")  private int totalPages;

    public int getTotalItems() {
        return totalItems;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }
}
