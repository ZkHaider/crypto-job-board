package com.cryptojobboard.cryptojobboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.cryptojobboard.cryptojobboard.feed.FeedFragment;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create fragment and pass in arguments
        String jsonString = loadJSONString();
        Bundle arguments = new Bundle();
        arguments.putString("data", jsonString);
        FeedFragment feedFragment = new FeedFragment();
        feedFragment.setArguments(arguments);
        loadFragment(feedFragment);
    }

    private void loadFragment(Fragment fragment) {
        // Create a fragment manager
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commit();
    }

    private String loadJSONString() {
        String json;
        try {

            InputStream is = getResources().openRawResource(R.raw.sample_data);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            Log.e("MainActivity:", e.getMessage());
            return null;
        }
        return json;
    }

}
