package com.cryptojobboard.cryptojobboard.feed;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cryptojobboard.cryptojobboard.R;
import com.cryptojobboard.cryptojobboard.feed.recyclerview.FeedAdapter;
import com.google.gson.Gson;

public class FeedFragment extends Fragment {

    /**
     * Feed Adapter
     */
    Data mData;
    FeedAdapter mFeedAdapter;

    View view;
    Button mButtonActionBar;
    RecyclerView rvFeed;

    private BottomSheetBehavior mBottomSheetBehavior;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Bundle
        Bundle bundle = getArguments();
        if (bundle != null) {
            if (bundle.containsKey("data")) {
                String json = bundle.getString("data");
                mData = new Gson().fromJson(json, Data.class);
            }
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feed, container, false);
        initializeView(view);
        return view;
    }

    private void initializeView(final View view) {

        this.rvFeed = view.findViewById(R.id.rvFeed);

        mFeedAdapter = new FeedAdapter(mData, getActivity(), new FeedType.Job());

        // Initialize recyclerview
        rvFeed.setAdapter(mFeedAdapter);
        rvFeed.setLayoutManager(new LinearLayoutManager(getActivity()));

        NestedScrollView nestedScrollView = view.findViewById(R.id.bottom_sheet);

        // Initialize Action Bar
        mButtonActionBar = view.findViewById(R.id.bSetupAccount);
        mButtonActionBar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                intentWalletActivity(v);
            }
        });

        mBottomSheetBehavior = BottomSheetBehavior.from(nestedScrollView);
        mBottomSheetBehavior.setPeekHeight(100);
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }

    /** Called when the user taps the Send button */
    public void intentWalletActivity(View view) {
        Intent intent = new Intent(view.getContext(), CardLogosActivity.class);
        startActivity(intent);

    }

}