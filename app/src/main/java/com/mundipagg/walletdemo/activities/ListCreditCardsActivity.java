package com.mundipagg.walletdemo.activities;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jgabrielfreitas.layoutid.annotations.InjectLayout;
import com.mundipagg.api.creditcard.CreditCardFromList;
import com.mundipagg.api.response.creditcard.delete.CreditCardDeleteResponse;
import com.mundipagg.api.response.creditcard.list.CreditCardListResponse;
import com.mundipagg.api.service.creditcard.CreditCardServiceLayer;
import com.mundipagg.api.service.creditcard.delete.DeleteCreditCardCallback;
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
public class ListCreditCardsActivity extends DemoBaseActivity implements CreditCardListCallback, AdapterView.OnItemClickListener {

    @Bind(R.id.creditCardListView)
    ListView creditCardListView;
    private CreditCardListResponse creditCardListResponse;

    @Override
    protected void modifyViews() {
        super.modifyViews();
        new CreditCardServiceLayer(this).getAllCreditCards(this);
    }

    @Override
    public void onSuccess(CreditCardListResponse response) {
        creditCardListResponse = response;
        List<String> cards = new ArrayList<>();

        for (CreditCardFromList creditCardFromList : response.getData())
            cards.add(format("%s\n**** **** **** %s (%s)", creditCardFromList.getHolderName(), creditCardFromList.getLastFourDigits(), creditCardFromList.getBrand()));

        creditCardListView.setAdapter(new EasyAdapter<>(this, SimpleListAdapter.class, cards));
        creditCardListView.setOnItemClickListener(this);
    }

    @Override
    public void responseServerError(CreditCardListResponse object, Response<CreditCardListResponse> response) {
        toast("CLIENT ERROR");
    }

    @Override
    public void onError(Throwable t) {
        toast("OH NO, ERROR...!!");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        new CreditCardServiceLayer(this).delete(creditCardListResponse.getData().get(position).getId(), new DeleteCreditCardCallback() {
            @Override
            public void onSuccess(CreditCardDeleteResponse response) {
                if (response.getResponse().getStatus().equalsIgnoreCase("deleted")) {
                    toast("Cartão deletado");
                    new CreditCardServiceLayer(ListCreditCardsActivity.this).getAllCreditCards(ListCreditCardsActivity.this);
                }
            }

            @Override
            public void responseServerError(CreditCardDeleteResponse object, Response<CreditCardDeleteResponse> response) {
                toast("CLIENT ERROR");
            }

            @Override
            public void onError(Throwable t) {
                toast("OH NO, ERROR...!!");
            }
        });
    }
}
