package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class TermsConditions extends AppCompatActivity {
    private CheckBox mTermsBox;
    private Button mSigUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_conditions);

        mTermsBox = (CheckBox) findViewById(R.id.activity_terms_conditions_box);
        mSigUpButton = (Button) findViewById(R.id.activity_terms_conditions_sigupbutton);

        //Button desactivé par défaut
        mSigUpButton.setEnabled(false);



//If one checkbox checked => button activates (not optimal: when uncheck deactivated!)
        mTermsBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton1, boolean b) {
                if (compoundButton1.isChecked()) {
                    mSigUpButton.setEnabled(true);
                }

                else {
                    mSigUpButton.setEnabled(false);
                }
            }
        });

        mSigUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent nextAgainIntent = new Intent(TermsConditions.this, FinalPage.class);
                //startActivity(nextAgainIntent);
            }
        });

    }
}