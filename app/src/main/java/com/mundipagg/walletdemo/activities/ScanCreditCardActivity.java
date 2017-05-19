package com.mundipagg.walletdemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jgabrielfreitas.layoutid.annotations.InjectLayout;
import com.mundipagg.api.creditcard.BillingAddress;
import com.mundipagg.api.creditcard.NewCreditCard;
import com.mundipagg.api.response.creditcard.create.CreateCreditCardResponse;
import com.mundipagg.api.service.creditcard.CreditCardServiceLayer;
import com.mundipagg.api.service.creditcard.create.CreateCreditCardCallback;
import com.mundipagg.walletdemo.R;

import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import retrofit2.Response;

@InjectLayout(layout = R.layout.activity_scan_credit_card)
public class ScanCreditCardActivity extends DemoBaseActivity implements CreateCreditCardCallback {

    private static final int MY_SCAN_REQUEST_CODE = 100;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent scanIntent = new Intent(this, CardIOActivity.class);

        // customize these values to suit your needs.
        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, true); // default: false
        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_CVV, true); // default: false
        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_CARDHOLDER_NAME, true); // default: false
        scanIntent.putExtra(CardIOActivity.EXTRA_USE_CARDIO_LOGO, false);
        scanIntent.putExtra(CardIOActivity.EXTRA_HIDE_CARDIO_LOGO, true);

        // MY_SCAN_REQUEST_CODE is arbitrary and is only used within this activity.
        startActivityForResult(scanIntent, MY_SCAN_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MY_SCAN_REQUEST_CODE) {

            if (data != null && data.hasExtra(CardIOActivity.EXTRA_SCAN_RESULT)) {
                CreditCard scanResult = data.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);

                NewCreditCard newCreditCard = new NewCreditCard();
                newCreditCard.setNumber(scanResult.cardNumber);
                newCreditCard.setSecurityCode(scanResult.cvv);
                newCreditCard.setExpMonth(scanResult.expiryMonth);
                newCreditCard.setExpYear(scanResult.expiryYear);
                newCreditCard.setHolderName(scanResult.cardholderName);

                BillingAddress address = new BillingAddress();
                address.setStreet("Malibu Point");
                address.setNumber("10880");
                address.setZipCode("90265");
                address.setNeighborhood("Central");
                address.setCity("Malibu");
                address.setState("CA");
                address.setCountry("US");

                newCreditCard.setBillingAddress(address);

                new CreditCardServiceLayer().create(newCreditCard, this);

            } else
                toast("scan canceled");
        } else {
            toast("No scan");
            killThisActivity();
        }
    }

    @Override
    public void onSuccess(CreateCreditCardResponse response) {
        toast("Card added successfully");
        killThisActivity();
    }

    @Override
    public void onError(Throwable t) {
        toast("HUGE ERROR");
        killThisActivity();
    }
}
