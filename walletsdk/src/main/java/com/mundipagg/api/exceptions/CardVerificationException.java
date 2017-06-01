package com.mundipagg.api.exceptions;

/**
 * Created by Kanda on 01/06/2017.
 */

public class CardVerificationException extends Throwable {
    public CardVerificationException(String errorMessage) {
        super(errorMessage);
    }
}
