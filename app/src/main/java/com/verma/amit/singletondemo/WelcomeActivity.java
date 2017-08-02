package com.verma.amit.singletondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcomeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeTV = (TextView) findViewById(R.id.welcomeTV);

        //Displaying our username using singleton class.
        welcomeTV.setText("Welcom \n" + Singleton.Instance().getUsername());
    }
}
