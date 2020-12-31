package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlsoProviderProfileActivity extends AppCompatActivity {
    private Button mAlsoProvider;
    private Button mNoProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_also_provider_profile);

        mAlsoProvider = (Button) findViewById(R.id.activity_also_Provider_profile_add_provider);
        mNoProvider = (Button) findViewById(R.id.activity_also_provider_profile_no_provider);

        mAlsoProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User clicked the button
                Intent nextNextIntent = new Intent(AlsoProviderProfileActivity.this, ProviderProfile2.class);
                startActivity(nextNextIntent); //qui va permettre a Android de récupérer les données de main activité et nous envoyer a la prochaine page

            }
        });

        mNoProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User clicked the button
                Intent nextNextIntent = new Intent(AlsoProviderProfileActivity.this, PaypalActivity.class);
                startActivity(nextNextIntent); //qui va permettre a Android de récupérer les données de main activité et nous envoyer a la prochaine page
            }
        });
    }
}