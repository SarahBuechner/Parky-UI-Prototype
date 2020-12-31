package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MaxPriceDriver extends AppCompatActivity {
    private EditText m10MinText;
    private EditText m30MinText;
    private EditText m1HourText;
    private EditText m8HoursText;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max_price_driver);

        m10MinText = (EditText) findViewById(R.id.activity_max_price_driver_10min);
        m30MinText = (EditText) findViewById(R.id.activity_max_price_driver_30min);
        m1HourText = (EditText) findViewById(R.id.activity_max_price_driver_1hour);
        m8HoursText = (EditText) findViewById(R.id.activity_max_price_driver_8hours);
        mNextButton = (Button) findViewById(R.id.activity_max_price_driver_nextbutton);

        //Next button not enabled by default
        mNextButton.setEnabled(false);

        //create listener for all 4 text fields > notification si l'utilisateur rentre qc dans champ
        m10MinText.addTextChangedListener(watcher);
        m30MinText.addTextChangedListener(watcher);
        m1HourText.addTextChangedListener(watcher);
        m8HoursText.addTextChangedListener(watcher);

        // on va etre notifier à chaque fois que l'utilisateur cliquera sur le button
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent nextIntent = new Intent(MaxPriceDriver.this, PaypalActivity.class);
                startActivity(nextIntent);
            }
        });

    }

    //Only activate the NEXT-button if all 4 fields are filled
    private final TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (m10MinText.getText().toString().length() == 0 || m30MinText.getText().toString().length() == 0 || m1HourText.getText().toString().length() == 0 || m8HoursText.getText().toString().length() == 0) {
                mNextButton.setEnabled(false);
            } else {
                mNextButton.setEnabled(true);
            }
        }
    };
}