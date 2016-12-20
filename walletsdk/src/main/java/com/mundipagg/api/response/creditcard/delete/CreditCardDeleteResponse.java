package com.mundipagg.api.response.creditcard.delete;

import com.google.gson.annotations.SerializedName;
import com.mundipagg.api.ResponseBase;
import com.mundipagg.api.creditcard.BillingAddress;
import com.mundipagg.api.creditcard.CreditCardBrand;
import com.mundipagg.api.creditcard.Customer;

/**
 * Created by jcosilva on 12/19/2016.
 */

public class CreditCardDeleteResponse extends ResponseBase {
    @SerializedName("id")
    private String id;
    @SerializedName("gateway_id")
    private String gatewayId;
    @SerializedName("last_four_digits")
    private String lastFourDigits;
    @SerializedName("brand")
    private CreditCardBrand brand;
    @SerializedName("status")
    private String status;
    @SerializedName("created_at")
    private String createtdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("deleted_at")
    private String deletedAt;
    @SerializedName("billing_address")
    private BillingAddress billingAddress;
    @SerializedName("customer")
    private Customer customer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getLastFourDigits() {
        return lastFourDigits;
    }

    public void setLastFourDigits(String lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    public CreditCardBrand getBrand() {
        return brand;
    }

    public void setBrand(CreditCardBrand brand) {
        this.brand = brand;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatetdAt() {
        return createtdAt;
    }

    public void setCreatetdAt(String createtdAt) {
        this.createtdAt = createtdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "DeleteCreditCard{" +
                "id='" + id + '\'' +
                ", gatewayId='" + gatewayId + '\'' +
                ", lastFourDigits='" + lastFourDigits + '\'' +
                ", brand=" + brand +
                ", status='" + status + '\'' +
                ", createtdAt='" + createtdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                ", billingAddress=" + billingAddress +
                ", customer=" + customer +
                '}';
    }
}
