package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidcodelabs.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    private ActivityTimePickerBinding timePickerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timePickerBinding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(timePickerBinding.getRoot());
        timePickerBinding.timePicker.setIs24HourView(true);
        timePickerBinding.datePickerTxt.setText(getCurrentTime());
        timePickerBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePickerBinding.datePickerTxt.setText(getCurrentTime());
            }
        });
    }

    private String getCurrentTime() {
        String currentTime = "Current time: " + timePickerBinding.timePicker.getCurrentHour() + ":" +timePickerBinding.timePicker.getCurrentMinute();
        return currentTime;
    }
}