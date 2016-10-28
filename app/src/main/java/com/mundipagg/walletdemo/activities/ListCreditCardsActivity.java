package com.mundipagg.walletdemo.activities;

import android.widget.ListView;

import com.jgabrielfreitas.layoutid.annotations.InjectLayout;
import com.mundipagg.api.creditcard.CreditCard;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;
import com.mundipagg.api.service.creditcard.list.CreditCardListCallbackInterface;
import com.mundipagg.api.service.creditcard.list.CreditCardServiceLayer;
import com.mundipagg.walletdemo.R;
import com.mundipagg.walletdemo.adapters.SimpleListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import retrofit2.Response;
import uk.co.ribot.easyadapter.EasyAdapter;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;
import static java.lang.String.format;

@InjectLayout(layout = R.layout.activity_list_credit_cards)
public class ListCreditCardsActivity extends DemoBaseActivity implements CreditCardListCallbackInterface {

    @Bind(R.id.creditCardListView) ListView creditCardListView;

    @Override
    protected void modifyViews() {
        super.modifyViews();
        new CreditCardServiceLayer(this).getCreditCards(this);
    }

    @Override
    public void onSuccess(CreditCardListResponse response) {

        List<String> cards = new ArrayList<>();

        for (CreditCard creditCard : response.getData())
            cards.add(format("%s\n**** **** **** %s (%s)", creditCard.getHolderName(), creditCard.getLastFourDigits(), creditCard.getBrand()));

        creditCardListView.setAdapter(new EasyAdapter<>(this, SimpleListAdapter.class, cards));
    }

    @Override
    public void responseServerError(CreditCardListResponse object, Response<CreditCardListResponse> response) {
        makeText(this, "CLIENT ERROR", LENGTH_SHORT).show();
    }

    @Override
    public void onError(Throwable t) {
        makeText(this, "OH NO, ERROR...!!", LENGTH_SHORT).show();
    }
}
