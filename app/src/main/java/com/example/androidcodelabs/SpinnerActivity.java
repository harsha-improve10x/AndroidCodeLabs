package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivitySpinnerBinding;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    private ActivitySpinnerBinding spinnerBinding;
    private ArrayList<String> names;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        spinnerBinding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(spinnerBinding.getRoot());
        getSupportActionBar().setTitle("Spinner");
        setData();
        setNames();
    }

    private void setData() {
        names = new ArrayList<>();
        names.add("Harsha");
        names.add("Anupama");
        names.add("Prakash");
        names.add("Suresh");
        names.add("Rajesh");
    }

    private void setNames () {
        arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,names);
        spinnerBinding.nameSp.setAdapter(arrayAdapter);
        spinnerBinding.nameSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnerActivity.this,
                        "Your name is " + names.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}