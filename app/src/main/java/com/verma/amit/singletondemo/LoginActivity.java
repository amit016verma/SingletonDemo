package com.verma.amit.singletondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText userNameEditText,PassEditText;
    Button LoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intializeView();

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // On login button click, storing our username into singleton class.
                Singleton.Instance().setUsername(userNameEditText.getText().toString());

                Intent welcomeActivity = new Intent(LoginActivity.this, WelcomeActivity.class);
                startActivity(welcomeActivity);
            }
        });
    }

    private void intializeView() {
        userNameEditText = (EditText)findViewById(R.id.userNameEditText);
        PassEditText = (EditText)findViewById(R.id.PassEditText);
        LoginButton = (Button)findViewById(R.id.LoginButton);
    }
}
