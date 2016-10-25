package com.mundipagg.encoder;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JGabrielFreitas on 24/10/16.
 */
public class Base64Test {

    @Test
    public void encode() throws Exception {

        String textToEncode = "sk_test_A0bkwbvFE2uOlWYE:";
        String textEncoded = new Base64().encode(textToEncode);
        String outputEncoded = "c2tfdGVzdF9BMGJrd2J2RkUydU9sV1lFOg==";

        Assert.assertEquals(outputEncoded, textEncoded);
    }

}