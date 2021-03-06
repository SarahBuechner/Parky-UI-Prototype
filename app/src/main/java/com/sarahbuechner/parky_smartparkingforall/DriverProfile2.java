package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DriverProfile2 extends AppCompatActivity {
    private CheckBox mClosedParking;
    private CheckBox mStreetParking;
    private CheckBox mCityCenter;
    private CheckBox mPublicTransport;
    private CheckBox mLimitTime;
    private CheckBox mCoveredParking;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_profile2);

        mClosedParking = (CheckBox) findViewById(R.id.activity_driver_profile2_closedparking);
        mStreetParking = (CheckBox) findViewById(R.id.activity_driver_profile2_streetparking);
        mCityCenter = (CheckBox) findViewById(R.id.activity_driver_profile2_citycenter);
        mPublicTransport = (CheckBox) findViewById(R.id.activity_driver_profile2_publictransport);
        mLimitTime = (CheckBox) findViewById(R.id.activity_driver_profile2_noparktimelimit);
        mCoveredParking = (CheckBox) findViewById(R.id.activity_driver_profile2_coveredparking);
        mNextButton = (Button) findViewById(R.id.activity_driver_profile2_nextbutton);

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User clicked the button
                Intent signUpIntent = new Intent(DriverProfile2.this, Time_Date_Driver2.class);
                startActivity(signUpIntent); //qui va permettre a Android de récupérer les données de main activité et nous envoyer a la prochaine page


            }
        });
    }
}