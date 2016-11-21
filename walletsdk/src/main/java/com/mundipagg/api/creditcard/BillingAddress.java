package com.mundipagg.api.creditcard;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JGabrielFreitas on 25/10/16.
 */

public class BillingAddress {

    @SerializedName("street")       private String street;
    @SerializedName("number")       private String number;
    @SerializedName("zip_code")     private String zipCode;
    @SerializedName("neighborhood") private String neighborhood;
    @SerializedName("city")         private String city;
    @SerializedName("state")        private String state;
    @SerializedName("country")      private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
