package com.cryptojobboard.cryptojobboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.cryptojobboard.cryptojobboard.feed.FeedFragment;
import com.cryptojobboard.cryptojobboard.rating.FiveStarsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new FiveStarsFragment());
    }

    private void loadFragment(Fragment fragment) {
        // Create a fragment manager
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commit();
    }

}
