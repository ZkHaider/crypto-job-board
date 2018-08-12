package com.cryptojobboard.cryptojobboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CandidateSpecificationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_specification_page);
        setTitle("Almost done!");
    }

    public void onSubmitClick( View view ) {
        Intent onToNext = new Intent(this.getApplicationContext(), MainActivity.class);
        startActivity(onToNext);
    }
}
