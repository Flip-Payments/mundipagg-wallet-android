package com.mundipagg.exceptions;

/**
 * Created by jcosilva on 7/6/2017.
 */

public class UnauthorizedException extends Throwable {
    public UnauthorizedException() {
        super("Unauthorized card operation");
    }
}
