package com.cryptojobboard.cryptojobboard.Employee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.cryptojobboard.cryptojobboard.R;

public class EmployeePortfolioActivity extends AppCompatActivity {

    ImageView mPictureIV;
    ImageView mRatingIV;
    TextView mNameTV;
    TextView mAboutMeTV;
    TextView mTitleTV;
    TextView mRatingTextView;
    TextView mSummaryTV;
    ImageView mPortfolioIV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_portfolio);

        mPictureIV = findViewById(R.id.ivEmployee);
        mRatingIV = findViewById(R.id.ivStars);
        mNameTV = findViewById(R.id.tvEmployeeName);
        mTitleTV = findViewById(R.id.tvEmployeeTitle);
        mRatingTextView = findViewById(R.id.tvEmployeeRating);

        mAboutMeTV = findViewById(R.id.tvAboutMe);
        mSummaryTV = findViewById(R.id.tvSummary);
        mSummaryTV.setText("I’m John. I specialize in iOS applications written in Swift, Objective C, and React Native.");
//        mPortfolioIV = findViewById(R.id.ivPortfolio);
    }
}
