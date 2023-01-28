package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {

    public ActivityRatingBarBinding ratingBarBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ratingBarBinding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(ratingBarBinding.getRoot());
        handleSubmitBtn();
    }

    // User Interface
    private void handleSubmitBtn() {
        ratingBarBinding.submitbtn.setOnClickListener(v -> {
            String rating = String.valueOf(ratingBarBinding.ratingBarRb.getRating());
            Toast.makeText(getApplicationContext(),rating, Toast.LENGTH_SHORT).show();
        });
    }
}