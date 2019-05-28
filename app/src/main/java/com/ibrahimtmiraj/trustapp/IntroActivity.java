package com.ibrahimtmiraj.trustapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ibrahimtmiraj.trustapp.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button initSignUpButton = (Button) findViewById(R.id.initSignUpButton);
        initSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotoSignup1 = new Intent(getApplicationContext(), Signup1Activity.class);
                startActivity(gotoSignup1);


            }
        });
    }


}
