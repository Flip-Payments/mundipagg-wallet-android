package com.mundipagg.util;

import com.mundipagg.annotations.CantBeNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by JGabrielFreitas on 26/10/16.
 */

public class AnnotationValidator {

    public boolean cantBeNull(Object object) {

        boolean hasAnnotation = false;
        boolean notNull       = true;

        try {

            Method[] methods = object.getClass().getMethods();
            for (Method method : methods)
                if (method.isAnnotationPresent(CantBeNull.class)) {
                    hasAnnotation = true;
                    if (method.invoke(object) == null)
                        notNull = false;
                }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return false;
        }

        return hasAnnotation && notNull;
    }

}
