package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidcodelabs.databinding.ActivityHorizontalScrollBinding;

public class HorizontalScrollActivity extends AppCompatActivity {

    private ActivityHorizontalScrollBinding activityHorizontalScrollBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHorizontalScrollBinding = ActivityHorizontalScrollBinding.inflate(getLayoutInflater());
        setContentView(activityHorizontalScrollBinding.getRoot());
        getSupportActionBar().setTitle("Horizontal Scroll View");
    }
}