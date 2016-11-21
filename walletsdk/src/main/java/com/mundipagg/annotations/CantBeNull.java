package com.mundipagg.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by JGabrielFreitas on 26/10/16.
 */

@Target(METHOD)
@Retention(RUNTIME)
public @interface CantBeNull {
}
