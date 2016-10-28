package com.mundipagg.walletdemo.adapters;

import android.view.View;
import android.widget.TextView;

import com.mundipagg.walletdemo.R;

import uk.co.ribot.easyadapter.ItemViewHolder;
import uk.co.ribot.easyadapter.PositionInfo;
import uk.co.ribot.easyadapter.annotations.LayoutId;
import uk.co.ribot.easyadapter.annotations.ViewId;

/**
 * Created by JGabrielFreitas on 28/10/16.
 */
@LayoutId(R.layout.item_action)
public class SimpleListAdapter extends ItemViewHolder<String> {

    @ViewId(R.id.actionContentTextView)
    private TextView actionContentTextView;

    public SimpleListAdapter(View view) {
        super(view);
    }

    public SimpleListAdapter(View view, String item) {
        super(view, item);
    }

    @Override
    public void onSetValues(String item, PositionInfo positionInfo) {
        actionContentTextView.setText(item);
    }
}
