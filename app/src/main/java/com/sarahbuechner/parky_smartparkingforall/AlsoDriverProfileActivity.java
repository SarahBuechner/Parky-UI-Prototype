package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlsoDriverProfileActivity extends AppCompatActivity {
    private Button mAlsoDriver;
    private Button mNoDriver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_also_driver_profile);

        mAlsoDriver = (Button) findViewById(R.id.activity_also_driver_profile_add_driver);
        mNoDriver = (Button) findViewById(R.id.activity_also_driver_profile_no_driver);


        mAlsoDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User clicked the button
                Intent nextNextIntent = new Intent(AlsoDriverProfileActivity.this, DriverProfile1.class);
                startActivity(nextNextIntent); //qui va permettre a Android de récupérer les données de main activité et nous envoyer a la prochaine page

            }
        });

        mNoDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User clicked the button
                Intent nextNextIntent = new Intent(AlsoDriverProfileActivity.this, PaypalActivity.class);
                startActivity(nextNextIntent); //qui va permettre a Android de récupérer les données de main activité et nous envoyer a la prochaine page
            }
        });

    }
}