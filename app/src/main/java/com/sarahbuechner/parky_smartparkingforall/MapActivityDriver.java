package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapActivityDriver extends AppCompatActivity {
    private Button mNextButtonZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_driver);

        //set IDs
        mNextButtonZ = (Button) findViewById(R.id.activity_map_driver_nextbutton);


        mNextButtonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User clicked the button
                Intent nextNextIntent = new Intent(MapActivityDriver.this, MaxPriceDriver.class);
                startActivity(nextNextIntent); //qui va permettre a Android de récupérer les données de main activité et nous envoyer a la prochaine page

            }
        });


    }
}