package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidcodelabs.databinding.ActivityVerticalScrollBinding;

public class VerticalScrollActivity extends AppCompatActivity {

    private ActivityVerticalScrollBinding verticalScrollBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        verticalScrollBinding = ActivityVerticalScrollBinding.inflate(getLayoutInflater());
        setContentView(verticalScrollBinding.getRoot());
        getSupportActionBar().setTitle("Vertical Scroll View");
    }
}