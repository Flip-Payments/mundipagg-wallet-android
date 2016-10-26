package json.deserialization;

import com.google.gson.Gson;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;
import com.mundipagg.util.AnnotationValidator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JGabrielFreitas on 26/10/16.
 */

public class CreditCardListResponseTest {

    @Test
    public void validate_list_with_annotation_success() {

        String response = "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": \"card_2XzJR4NU6HXXA0Gy\",\n" +
                "      \"gateway_id\": \"6c4ecc44-5afe-406e-b19c-963659fc828b\",\n" +
                "      \"last_four_digits\": \"0000\",\n" +
                "      \"brand\": \"Jcb\",\n" +
                "      \"holder_name\": \"Tony Stark\",\n" +
                "      \"exp_month\": 1,\n" +
                "      \"exp_year\": 2018,\n" +
                "      \"status\": \"active\",\n" +
                "      \"created_at\": \"2016-10-24T19:09:31\",\n" +
                "      \"updated_at\": \"2016-10-24T19:09:31\",\n" +
                "      \"billing_address\": {\n" +
                "        \"street\": \"Malibu Point\",\n" +
                "        \"number\": \"10880\",\n" +
                "        \"zip_code\": \"90265\",\n" +
                "        \"neighborhood\": \"Central Malibu\",\n" +
                "        \"city\": \"Malibu\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"country\": \"US\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"card_rjNZKosz5uNkZza5\",\n" +
                "      \"gateway_id\": \"29419a4d-3634-4635-834b-f0b26470ddd2\",\n" +
                "      \"last_four_digits\": \"5904\",\n" +
                "      \"brand\": \"Diners\",\n" +
                "      \"holder_name\": \"Tony Stark\",\n" +
                "      \"exp_month\": 1,\n" +
                "      \"exp_year\": 2018,\n" +
                "      \"status\": \"active\",\n" +
                "      \"created_at\": \"2016-10-24T19:09:21\",\n" +
                "      \"updated_at\": \"2016-10-24T19:09:21\",\n" +
                "      \"billing_address\": {\n" +
                "        \"street\": \"Malibu Point\",\n" +
                "        \"number\": \"10880\",\n" +
                "        \"zip_code\": \"90265\",\n" +
                "        \"neighborhood\": \"Central Malibu\",\n" +
                "        \"city\": \"Malibu\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"country\": \"US\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"card_rjORlPaHmCzJRkJm\",\n" +
                "      \"gateway_id\": \"ecf115c4-255d-4137-9aff-5cb370b65d58\",\n" +
                "      \"last_four_digits\": \"1117\",\n" +
                "      \"brand\": \"Discover\",\n" +
                "      \"holder_name\": \"LUKE SKYWALKER\",\n" +
                "      \"exp_month\": 1,\n" +
                "      \"exp_year\": 2018,\n" +
                "      \"status\": \"active\",\n" +
                "      \"created_at\": \"2016-10-24T19:09:21\",\n" +
                "      \"updated_at\": \"2016-10-24T19:09:21\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"card_WqM75mAXIGuW5JD0\",\n" +
                "      \"gateway_id\": \"f7b41349-3cd6-4f0c-8139-c1ef37026fe6\",\n" +
                "      \"last_four_digits\": \"4444\",\n" +
                "      \"brand\": \"Mastercard\",\n" +
                "      \"holder_name\": \"LUKE SKYWALKER\",\n" +
                "      \"exp_month\": 1,\n" +
                "      \"exp_year\": 2018,\n" +
                "      \"status\": \"active\",\n" +
                "      \"created_at\": \"2016-10-24T19:08:46\",\n" +
                "      \"updated_at\": \"2016-10-24T19:08:46\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"card_XkVxGJC3zh6qZL8Y\",\n" +
                "      \"gateway_id\": \"493b3680-83ae-4a5f-b62e-b8f86df026d6\",\n" +
                "      \"last_four_digits\": \"4242\",\n" +
                "      \"brand\": \"Visa\",\n" +
                "      \"holder_name\": \"LUKE SKYWALKER\",\n" +
                "      \"exp_month\": 1,\n" +
                "      \"exp_year\": 2018,\n" +
                "      \"status\": \"active\",\n" +
                "      \"created_at\": \"2016-10-24T19:08:27\",\n" +
                "      \"updated_at\": \"2016-10-24T19:08:27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"card_LKn0jztvyFzb0eop\",\n" +
                "      \"gateway_id\": \"4382e34d-83fe-4451-b5f3-9ebb80b36168\",\n" +
                "      \"last_four_digits\": \"8229\",\n" +
                "      \"brand\": \"Amex\",\n" +
                "      \"holder_name\": \"Tony Stark\",\n" +
                "      \"exp_month\": 1,\n" +
                "      \"exp_year\": 2018,\n" +
                "      \"status\": \"active\",\n" +
                "      \"created_at\": \"2016-10-24T19:06:21\",\n" +
                "      \"updated_at\": \"2016-10-24T19:06:21\",\n" +
                "      \"billing_address\": {\n" +
                "        \"street\": \"Malibu Point\",\n" +
                "        \"number\": \"10880\",\n" +
                "        \"zip_code\": \"90265\",\n" +
                "        \"neighborhood\": \"Central Malibu\",\n" +
                "        \"city\": \"Malibu\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"country\": \"US\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"paging\": {\n" +
                "    \"total_items\": 6,\n" +
                "    \"current_page\": 1,\n" +
                "    \"total_pages\": 1\n" +
                "  }\n" +
                "}";

        CreditCardListResponse cardList = new Gson().fromJson(response, CreditCardListResponse.class);
        Assert.assertTrue(new AnnotationValidator().cantBeNull(cardList));

    }

    @Test
    public void validate_list_with_not_null_success() {

        String response = "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": \"card_2XzJR4NU6HXXA0Gy\",\n" +
                "      \"gateway_id\": \"6c4ecc44-5afe-406e-b19c-963659fc828b\",\n" +
                "      \"last_four_digits\": \"0000\",\n" +
                "      \"brand\": \"Jcb\",\n" +
                "      \"holder_name\": \"Tony Stark\",\n" +
                "      \"exp_month\": 1,\n" +
                "      \"exp_year\": 2018,\n" +
                "      \"status\": \"active\",\n" +
                "      \"created_at\": \"2016-10-24T19:09:31\",\n" +
                "      \"updated_at\": \"2016-10-24T19:09:31\",\n" +
                "      \"billing_address\": {\n" +
                "        \"street\": \"Malibu Point\",\n" +
                "        \"number\": \"10880\",\n" +
                "        \"zip_code\": \"90265\",\n" +
                "        \"neighborhood\": \"Central Malibu\",\n" +
                "        \"city\": \"Malibu\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"country\": \"US\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"card_rjNZKosz5uNkZza5\",\n" +
                "      \"gateway_id\": \"29419a4d-3634-4635-834b-f0b26470ddd2\",\n" +
                "      \"last_four_digits\": \"5904\",\n" +
                "      \"brand\": \"Diners\",\n" +
                "      \"holder_name\": \"Tony Stark\",\n" +
                "      \"exp_month\": 1,\n" +
                "      \"exp_year\": 2018,\n" +
                "      \"status\": \"active\",\n" +
                "      \"created_at\": \"2016-10-24T19:09:21\",\n" +
                "      \"updated_at\": \"2016-10-24T19:09:21\",\n" +
                "      \"billing_address\": {\n" +
                "        \"street\": \"Malibu Point\",\n" +
                "        \"number\": \"10880\",\n" +
                "        \"zip_code\": \"90265\",\n" +
                "        \"neighborhood\": \"Central Malibu\",\n" +
                "        \"city\": \"Malibu\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"country\": \"US\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"paging\": {\n" +
                "    \"total_items\": 6,\n" +
                "    \"current_page\": 1,\n" +
                "    \"total_pages\": 1\n" +
                "  }\n" +
                "}";

        CreditCardListResponse cardList = new Gson().fromJson(response, CreditCardListResponse.class);
        Assert.assertTrue(cardList != null);

    }

}
