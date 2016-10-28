package com.mundipagg.util;

import com.mundipagg.api.Page;
import com.mundipagg.api.creditcard.CreditCard;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by JGabrielFreitas on 26/10/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationValidatorTest {

    @Mock CreditCardListResponse listResponse;
    @Mock List<CreditCard>       creditCards;
    @Mock Page                   page;

    @Before
    public void setUp() {

        MockitoAnnotations.initMocks(this);

        when(listResponse.getData()).thenReturn(creditCards);
        when(listResponse.getPaging()).thenReturn(page);
    }


    @Test
    public void annotation_error() throws Exception {

        Assert.assertFalse(new AnnotationValidator().cantBeNull(""));
    }

    @Test
    public void annotation_success_mocked() throws Exception {

//        CreditCardListResponse listResponse = mock(CreditCardListResponse.class);
        Assert.assertTrue(new AnnotationValidator().cantBeNull(listResponse));
    }

}