package com.sarahbuechner.parky_smartparkingforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class UserType_Activity extends AppCompatActivity {
    private CheckBox mDriverBox;
    private CheckBox mProviderBox;
    private Button mNextButtonType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type_);

        //Assign IDs
        mDriverBox = (CheckBox) findViewById(R.id.activity_user_type_box_driver);
        mProviderBox = (CheckBox) findViewById(R.id.activity_user_type_box_provider);
        mNextButtonType = (Button) findViewById(R.id.activity_user_type_nextbutton);

        //Button desactivé par défaut
        mNextButtonType.setEnabled(false);



//If one checkbox checked => button activates (not optimal: when uncheck deactivated!)
        mDriverBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton1, boolean b) {
                if (compoundButton1.isChecked()) {
                    mNextButtonType.setEnabled(true);
                }

                else {
                    mNextButtonType.setEnabled(false);
                }
            }
        });

        mProviderBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton2, boolean b) {
                if (compoundButton2.isChecked()) {
                    mNextButtonType.setEnabled(true);
                }
                else {
                    mNextButtonType.setEnabled(false);
                }
            }
        });


        mNextButtonType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mDriverBox.isChecked()) {
                    Intent nextAgainIntent = new Intent(UserType_Activity.this, DriverProfile2.class);
                    startActivity(nextAgainIntent);
                }
                else {
                    Intent nextAgainIntent = new Intent(UserType_Activity.this, ProviderProfile1.class);
                    startActivity(nextAgainIntent);
                }
            }
        });



    }

}