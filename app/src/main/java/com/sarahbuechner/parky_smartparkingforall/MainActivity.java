package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mSignUpButton;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign id to buttons
        mSignUpButton = (Button) findViewById(R.id.activity_main_signup);
        mLoginButton = (Button) findViewById(R.id.activity_main_login);

        // on active les boutons
        mSignUpButton.setEnabled(true);
        mLoginButton.setEnabled(true);

        // on va être notifié à chaque fois que l'utilisateur cliquera sur le button
        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User clicked the button
                Intent signUpIntent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(signUpIntent); //qui va permettre a Android de récupérer les données de main activité et nous envoyer a la prochaine page

            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}