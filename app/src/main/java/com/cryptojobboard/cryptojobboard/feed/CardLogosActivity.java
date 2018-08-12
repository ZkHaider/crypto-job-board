package com.cryptojobboard.cryptojobboard.feed;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.cryptojobboard.cryptojobboard.PurchaseEthereumActivity;
import com.cryptojobboard.cryptojobboard.R;

public class CardLogosActivity extends AppCompatActivity implements CCRecyclerViewAdapter.ItemClickListener {

    CCRecyclerViewAdapter mRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_logos_activity);

        int[] logos = {
                R.drawable.amazon,
                R.drawable.amex,
                R.drawable.citrus,
                R.drawable.discover,
                R.drawable.ebay,
                R.drawable.electron,
                R.drawable.eway,
                R.drawable.jcb,
                R.drawable.maestro,
                R.drawable.mastercard,
                R.drawable.paypal,
                R.drawable.sage,
                R.drawable.shopify,
                R.drawable.skrill,
                R.drawable.visa,
                R.drawable.westernunion,
                R.drawable.worldpay
        };

        // set up the RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvLogos);
        int numberOfColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        mRecyclerViewAdapter = new CCRecyclerViewAdapter(this, logos);
        mRecyclerViewAdapter.setClickListener(this);
        recyclerView.setAdapter(mRecyclerViewAdapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this, PurchaseEthereumActivity.class);
        startActivity(intent);
    }

}
