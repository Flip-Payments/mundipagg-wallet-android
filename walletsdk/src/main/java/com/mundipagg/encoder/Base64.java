package com.mundipagg.encoder;



/**
 * Created by JGabrielFreitas on 24/10/16.
 */

public class Base64 {

    public String encode(String textToEncode) {
        return new String(org.apache.commons.codec.binary.Base64.encodeBase64(textToEncode.getBytes()));
    }

}
