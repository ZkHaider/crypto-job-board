package com.cryptojobboard.cryptojobboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class userTypeSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type_selection);
        setTitle("");
    }

    public void onUserSelectionOfType( View view )
    {
        Intent startPageIntent;

        switch ( view.getId() ) {

            case R.id.employerButton:
                //Jump to the company details page

                startPageIntent =  new Intent(this.getApplicationContext(), companyDetails.class);
                startActivity( startPageIntent );

                break;
            case R.id.candidateButton:
                //Something
                Toast.makeText(this, "Candidate", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
