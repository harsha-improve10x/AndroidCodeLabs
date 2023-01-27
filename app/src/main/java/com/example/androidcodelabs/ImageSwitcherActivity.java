package com.example.androidcodelabs;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.androidcodelabs.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity {

    private ActivityImageSwitcherBinding imageSwitcherBinding;
    private  int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageSwitcherBinding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(imageSwitcherBinding.getRoot());
        handleImageSwitcher();
        handleNextBtn();
    }

    private void handleImageSwitcher() {
        imageSwitcherBinding.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(R.drawable.garelu);
                return imageView;
            }
        });
    }

    private void handleNextBtn() {
        Animation animationOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation animationIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        imageSwitcherBinding.imageSwitcher.setOutAnimation(animationOut);
        imageSwitcherBinding.imageSwitcher.setInAnimation(animationIn);
        imageSwitcherBinding.nextbtn.setOnClickListener(v -> {
            setImages();
        });
    }

    private void setImages() {
        int[] imageSwitcherImages = {R.drawable.garelu, R.drawable.boorelu, R.drawable.daddojanam,
        R.drawable.pulihora};
        count++;
        if (count == imageSwitcherImages.length) {
            count = 0;
            imageSwitcherBinding.imageSwitcher.setImageResource(imageSwitcherImages[count]);
        } else {
                imageSwitcherBinding.imageSwitcher.setImageResource(imageSwitcherImages[count]);
            }
        }
    }