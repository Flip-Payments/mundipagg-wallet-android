package com.mundipagg.util;

import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by JGabrielFreitas on 26/10/16.
 */
public class AnnotationValidatorTest {

    @Test
    public void annotation_error() throws Exception {

        Assert.assertFalse(new AnnotationValidator().cantBeNull(""));
    }

    @Test
    public void annotation_success_mocked() throws Exception {

        CreditCardListResponse listResponse = mock(CreditCardListResponse.class);
        Assert.assertFalse(new AnnotationValidator().cantBeNull(listResponse));
    }

}