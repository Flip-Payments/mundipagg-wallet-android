package com.mundipagg.api.creditcard;

import java.io.Serializable;

public enum CreditCardBrand implements Serializable {
    JCB,
    DINERS,
    DISCOVER,
    MASTERCARD,
    VISA,
    AMEX,
    AURA,
    ELO,
    HIPERCARD,
    SODEXO,
    ALELO,
    TICKET,
    UNKNOWN;
    public static CreditCardBrand getBrandByText(String value) {
        for (CreditCardBrand category : values()) {
            if (category.toString().equalsIgnoreCase(value)) {
                return category;
            }
        }
        return UNKNOWN;
    }
}
