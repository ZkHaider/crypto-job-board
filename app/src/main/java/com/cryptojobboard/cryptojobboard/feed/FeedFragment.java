package com.cryptojobboard.cryptojobboard.feed;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cryptojobboard.cryptojobboard.R;
import com.cryptojobboard.cryptojobboard.feed.recyclerview.FeedAdapter;
import com.google.gson.Gson;

public class FeedFragment extends Fragment {

    /**
     * Feed Adapter
     */
    Data mData;
    FeedAdapter mFeedAdapter;

    RecyclerView rvFeed;

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
        this.rvFeed = view.findViewById(R.id.rvFeed);

        mFeedAdapter = new FeedAdapter(mData, getActivity(), new FeedType.Job());

        // Initialize recyclerview
        rvFeed.setAdapter(mFeedAdapter);
        rvFeed.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

}