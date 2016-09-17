package com.example.android.omen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;


public class Main3Activity extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        //________ this code makes the return button ________///
        Button btn1 = (Button) findViewById(R.id.returnButton);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
            //___________Hesamsameni________///
    });


    }

}

