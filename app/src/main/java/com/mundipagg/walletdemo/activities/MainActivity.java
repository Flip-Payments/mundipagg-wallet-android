package com.mundipagg.walletdemo.activities;

import android.widget.ListView;
import android.widget.Toast;

import com.jgabrielfreitas.layoutid.annotations.InjectLayout;
import com.mundipagg.walletdemo.R;
import com.mundipagg.walletdemo.activities.DemoBaseActivity;
import com.mundipagg.walletdemo.activities.ListCreditCardsActivity;
import com.mundipagg.walletdemo.adapters.SimpleListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnItemClick;
import uk.co.ribot.easyadapter.EasyAdapter;

@InjectLayout(layout = R.layout.activity_main)
public class MainActivity extends DemoBaseActivity {

    @Bind(R.id.actionsRecyclerView) ListView actionsRecyclerView;

    @Override
    protected void modifyViews() {
        super.modifyViews();

        List<String> actions = new ArrayList<>();
        actions.add("Listar cartões");

        actionsRecyclerView.setAdapter(new EasyAdapter<>(this, SimpleListAdapter.class, actions));
    }

    @OnItemClick(R.id.actionsRecyclerView)
    public void onActionClicked(int position) {
        switch (position) {
            case 0:
                doIntent(ListCreditCardsActivity.class);
        }
    }
}
