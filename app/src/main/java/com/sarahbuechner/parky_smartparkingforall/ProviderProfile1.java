package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class ProviderProfile1 extends AppCompatActivity {
    private CheckBox mClosedParkingBox;
    private CheckBox mStreetParkingBox;
    private EditText mNumberField;
    private CheckBox mCityCenterBox;
    private CheckBox mPublicTransportBox;
    private CheckBox mParktimeLimitBox;
    private CheckBox mCoveredParkingBox;
    private Button mNextButtonx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_profile1);

        //set IDs
        mClosedParkingBox = (CheckBox) findViewById(R.id.activity_provider_profile1_closedparking);
        mStreetParkingBox = (CheckBox) findViewById(R.id.activity_provider_profile1_streetparking);
        mNumberField = (EditText) findViewById(R.id.activity_provider_profile1_number);
        mCityCenterBox = (CheckBox) findViewById(R.id.activity_provider_profile1_citycenter);
        mPublicTransportBox = (CheckBox) findViewById(R.id.activity_provider_profile1_publictransport);
        mParktimeLimitBox = (CheckBox) findViewById(R.id.activity_provider_profile1_noparktimelimit);
        mCoveredParkingBox = (CheckBox) findViewById(R.id.activity_provider_profile1_coveredparking);
        mNextButtonx = (Button) findViewById(R.id.activity_provider_profile1_nextbutton);

        // only one checkbox (of the first two) can be checked
        mClosedParkingBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mStreetParkingBox.setChecked(false);
                }
            }
        });
        mStreetParkingBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mClosedParkingBox.setChecked(false);
                }
            }
        });

        mNextButtonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User clicked the button
                Intent signUpIntent = new Intent(ProviderProfile1.this, Time_Date_Provider.class);
                startActivity(signUpIntent); //qui va permettre a Android de récupérer les données de main activité et nous envoyer a la prochaine page

            }
        });
    }
}