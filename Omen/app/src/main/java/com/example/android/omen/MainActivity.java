package com.example.android.omen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //** Goto second activity and print username and birthmonth *//
    public void onClick(View view) {

        Intent i = new Intent(this, Main2Activity.class);

        //_____Username____/////
        final EditText inputName = (EditText) findViewById(R.id.inputName);
        String userMessage = inputName.getText().toString();
        i.putExtra("appleMessage", userMessage);

        ///____Birthmonth____////
        final Spinner birthMonth = (Spinner) findViewById(R.id.spin);
        String birthMonth2 = birthMonth.getSelectedItem().toString();
        i.putExtra("baconMessage", birthMonth2);


        startActivity(i);


    }

    public void onClickHistory(View view) {

        Intent history = new Intent(this, Main3Activity.class);
        startActivity(history);
    }


}














