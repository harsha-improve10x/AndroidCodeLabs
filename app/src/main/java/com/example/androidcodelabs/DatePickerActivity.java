package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidcodelabs.databinding.ActivityDatePickerBinding;

public class DatePickerActivity extends AppCompatActivity {

    private ActivityDatePickerBinding datePickerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datePickerBinding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(datePickerBinding.getRoot());
        getSupportActionBar().setTitle("Date Picker");
        datePickerBinding.datePickerTxt.setText("Change Date: " + getCurrentDate());
        datePickerBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerBinding.datePickerTxt.setText("Change Date: " + getCurrentDate());
            }
        });
    }

    private String getCurrentDate() {
        StringBuilder builder = new StringBuilder();
        builder.append((datePickerBinding.datePicker.getMonth() + 1) + "/");
        builder.append(datePickerBinding.datePicker.getDayOfMonth() + "/");
        builder.append(datePickerBinding.datePicker.getYear());
        return builder.toString();
    }
}