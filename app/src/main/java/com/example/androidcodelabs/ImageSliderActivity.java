package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidcodelabs.databinding.ActivityImageSliderBinding;

public class ImageSliderActivity extends AppCompatActivity {

    private ActivityImageSliderBinding imageSliderBinding;
    private ViewPager viewPager;
    private ImageSliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageSliderBinding = ActivityImageSliderBinding.inflate(getLayoutInflater());
        setContentView(imageSliderBinding.getRoot());
        getSupportActionBar().setTitle("Image Slider");
        setImageAdapter();
    }

    private void setImageAdapter() {
        viewPager = (ViewPager) imageSliderBinding.viewPager;
        sliderAdapter = new ImageSliderAdapter();
        viewPager.setAdapter(sliderAdapter);
    }
}