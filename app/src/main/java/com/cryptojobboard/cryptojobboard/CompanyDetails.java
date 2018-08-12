package com.cryptojobboard.cryptojobboard;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CompanyDetails extends AppCompatActivity {

    SQLiteDatabase companyInfoDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_details);
        setTitle("Sign-up");

    }

    //This is the function called by the submit button
    public void submitButtonCompanyDetailsPage( View view )
    {

        Toast.makeText(this, "Saving...", Toast.LENGTH_SHORT).show();
        /*Prepares all the info the user input to be added into the SQLite database*/

        TextView orgName = findViewById(R.id.nameInput);
        String nameString = orgName.getText().toString();

        TextView phoneInfo = findViewById(R.id.phoneInput);
        String phoneString = phoneInfo.getText().toString();

        TextView emailInfo = findViewById(R.id.emailInput);
        String emailString = emailInfo.getText().toString();

        TextView streetInfo = findViewById(R.id.streetInput);
        String streetString = streetInfo.getText().toString();

        TextView cityInfo = findViewById(R.id.cityInput);
        String cityString = cityInfo.getText().toString();

        //Inserting all the info:
        //Create an SQLite database to save the user info for later use
        try {

            companyInfoDataBase = this.openOrCreateDatabase("companyInfo", MODE_PRIVATE, null);
            companyInfoDataBase.execSQL("CREATE TABLE IF NOT EXISTS companyInfoTable (name VARCHAR, phone VARCHAR, email VARCHAR, street VARCHAR, city VARCHAR)");

            //*************THIS FUNCTION DELETES THE TABLE EVERY TIME. SHOULD ONLY BE USED WHILE TESTING TO NOT OVERFILL WITH GARBAGE****************
            //Only use when clearing the data. Won't log or save anything if the line is not commented out
            //**************************************************************************************************************************************
            companyInfoDataBase.execSQL("DROP TABLE IF EXISTS companyInfoTable");
            //**************************************************************************************************************************************
            //**************************************************************************************************************************************


            companyInfoDataBase.execSQL("INSERT INTO companyInfoTable (name,phone,email,street,city) VALUES ('" + nameString + "', '" + phoneString + "', '" + emailString + "', '" + streetString + "', '" + cityString +"')");

            //This function will log the data into the console. Useful for debugging the SQL table
            logDataBase( companyInfoDataBase );

        } catch(Exception e) {
            e.printStackTrace();
        }//End of try/catch block


        Intent nextPage = new Intent(getApplicationContext(), CandidateSpecificationPage.class);
        startActivity( nextPage );
    }

    public void logDataBase( SQLiteDatabase database )
    {
        /*
            This function serves to log all the info of the database
         */
        Cursor cursor = database.rawQuery("SELECT * FROM companyInfoTable", null);
        int nameIndex = cursor.getColumnIndex("name");
        int phoneIndex = cursor.getColumnIndex("phone");
        int emailIndex = cursor.getColumnIndex("email");
        int streetIndex = cursor.getColumnIndex("street");
        int cityIndex = cursor.getColumnIndex("city");

        cursor.moveToFirst();

        while( cursor != null ) {

            Log.i("My Database name: ", cursor.getString(nameIndex));
            Log.i("My database phone: ", cursor.getString(phoneIndex));
            Log.i("My database email: ", cursor.getString(emailIndex));
            Log.i("My database street: ", cursor.getString(streetIndex));
            Log.i("My database city: ", cursor.getString(cityIndex));

            cursor.moveToNext();

        }
    }
}
