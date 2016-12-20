package com.mundipagg.walletdemo.activities;

import android.widget.ListView;

import com.jgabrielfreitas.layoutid.annotations.InjectLayout;
import com.mundipagg.api.creditcard.CreditCardFromList;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;
import com.mundipagg.api.service.creditcard.CreditCardServiceLayer;
import com.mundipagg.api.service.creditcard.list.CreditCardListCallback;
import com.mundipagg.walletdemo.R;
import com.mundipagg.walletdemo.adapters.SimpleListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import retrofit2.Response;
import uk.co.ribot.easyadapter.EasyAdapter;

import static java.lang.String.format;

@InjectLayout(layout = R.layout.activity_list_credit_cards)
public class ListCreditCardsActivity extends DemoBaseActivity implements CreditCardListCallback {

    @Bind(R.id.creditCardListView)
    ListView creditCardListView;

    @Override
    protected void modifyViews() {
        super.modifyViews();
        new CreditCardServiceLayer(this).getAllCreditCards(this);
    }

    @Override
    public void onSuccess(CreditCardListResponse response) {
        List<String> cards = new ArrayList<>();

        for (CreditCardFromList creditCardFromList : response.getData())
            cards.add(format("%s\n**** **** **** %s (%s)", creditCardFromList.getHolderName(), creditCardFromList.getLastFourDigits(), creditCardFromList.getBrand()));

        creditCardListView.setAdapter(new EasyAdapter<>(this, SimpleListAdapter.class, cards));
    }

    @Override
    public void responseServerError(CreditCardListResponse object, Response<CreditCardListResponse> response) {
        toast("CLIENT ERROR" + response.code());

    }

    @Override
    public void onError(Throwable t) {
        toast("OH NO, ERROR...!!");
    }
}
