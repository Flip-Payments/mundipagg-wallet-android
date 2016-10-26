package com.mundipagg.util;

import com.mundipagg.annotations.CantBeNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by JGabrielFreitas on 26/10/16.
 */

public class AnnotationValidator {

    public boolean cantBeNull(Object object) {

        try {

            Method[] methods = object.getClass().getMethods();
            for (Method method : methods)
                if (method.isAnnotationPresent(CantBeNull.class))
                    return method.invoke(object) != null;

        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

}
