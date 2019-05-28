package com.ibrahimtmiraj.trustapp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

public class Signup1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);

        Button signup1NextBtn = (Button) findViewById(R.id.signup1NextBtn);
        final TextInputEditText signup1FirstNameTextInputEditText = (TextInputEditText) findViewById(R.id.signup1FirstNameTextInputEditText);

        signup1NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoSignup2 = new Intent(getApplicationContext(), Signup2Activity.class);
                startActivity(gotoSignup2);
            }

        });

        signup1FirstNameTextInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String fieldString = signup1FirstNameTextInputEditText.getText().toString();

                if(fieldString.contentEquals("")) {
                    signup1FirstNameTextInputEditText.setError("This field cannot be empty");
                }

                if(fieldString.contains(" ")) {
                    signup1FirstNameTextInputEditText.setError("Name cannot contain spaces");
                }

                if(!fieldString.matches("^[a-zA-Z/-]*$")) {
                    signup1FirstNameTextInputEditText.setError("Name can only contain alphabets and -");
                }


            }

            @Override
            public void afterTextChanged(Editable s) {
                String fieldString = signup1FirstNameTextInputEditText.getText().toString();

                if(fieldString.contentEquals("")) {
                    signup1FirstNameTextInputEditText.setError("This field cannot be empty");
                }

                if(fieldString.contains(" ")) {
                    signup1FirstNameTextInputEditText.setError("Name cannot contain spaces");
                }

                if(!fieldString.matches("^[a-zA-Z/-]*$")) {
                    signup1FirstNameTextInputEditText.setError("Name can only contain alphabets and -");
                }


            }

        });


    }
}
