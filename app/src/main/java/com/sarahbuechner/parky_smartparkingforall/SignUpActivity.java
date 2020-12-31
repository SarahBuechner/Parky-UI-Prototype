package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    private EditText mNameText;
    private EditText mEmailText;
    private EditText mPasswordText;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //assign id to fields and button
        mNameText = (EditText) findViewById(R.id.activity_sign_up_completename);
        mEmailText = (EditText) findViewById(R.id.activity_sign_up_emailaddress);
        mPasswordText = (EditText) findViewById(R.id.activity_sign_up_password);
        mNextButton = (Button) findViewById(R.id.activity_sign_up_nextbutton);

        //Button desactivé par défaut
        mNextButton.setEnabled(false);

        //create listener for all 3 text fields > notification si l'utilisateur rentre qc dans champ
        mNameText.addTextChangedListener(watcher);
        mEmailText.addTextChangedListener(watcher);
        mPasswordText.addTextChangedListener(watcher);

        // on va etre notifier à chaque fois que l'utilisateur cliquera sur le button
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent nextIntent = new Intent(SignUpActivity.this, UserType_Activity.class);
                startActivity(nextIntent);
            }


        });

    }

    //Only activate the NEXT-button if all 3 fields are filled
    private final TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (mNameText.getText().toString().length() == 0 || mEmailText.getText().toString().length() == 0 || mPasswordText.getText().toString().length() == 0) {
                mNextButton.setEnabled(false);
            } else {
                mNextButton.setEnabled(true);
            }
        }
    };
}