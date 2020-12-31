package com.sarahbuechner.parky_smartparkingforall;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class Time_Date_Provider extends AppCompatActivity {
    private DatePicker mDatePicker;
    private TimePicker mTimePicker;
    private Button mNextButtonX;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_date_provider);

        //Set IDs
        mDatePicker = (DatePicker) findViewById(R.id.activity_time_date_provider_datepicker);
        mTimePicker = (TimePicker) findViewById(R.id.activity_time_date_provider_timepicker);
        mNextButtonX = (Button) findViewById(R.id.activity_time_date_provider_nextbutton);

        //Nextbutton deactivated by default
        mNextButtonX.setEnabled(false);

        //> how to activate it only if a date and a time was chosen?
        mDatePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                if (datePicker.isEnabled()) {
                    mNextButtonX.setEnabled(true);
                }
                else {
                    mNextButtonX.setEnabled(false);
                }
            }
        });

        mTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                if (timePicker.isEnabled()) {
                    mNextButtonX.setEnabled(true);
                }
                else {
                    mNextButtonX.setEnabled(false);
                }
            }
        });

        mNextButtonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextAgainIntent = new Intent(Time_Date_Provider.this, MapActivity.class);
                startActivity(nextAgainIntent);
            }
        });

    }
}