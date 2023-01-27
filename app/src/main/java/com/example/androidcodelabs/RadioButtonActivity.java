package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivityRadioButtonBinding;

public class RadioButtonActivity extends AppCompatActivity {

    private ActivityRadioButtonBinding radioButtonBinding;
    private Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        radioButtonBinding = ActivityRadioButtonBinding.inflate(getLayoutInflater());
        setContentView(radioButtonBinding.getRoot());
        handleVerifyBtn();
    }

    // User Interface
    private void handleVerifyBtn() {
        radioButtonBinding.verifybtn.setOnClickListener(v -> {
            setRadioBtn();
        });
    }

    // Business Logic
    private void setRadioBtn() {
        if (radioButtonBinding.radioBtn1.isChecked()) {
            Toast.makeText(this, "Your Answer is Wrong", Toast.LENGTH_SHORT).show();
        } else if (radioButtonBinding.radioBtn2.isChecked()) {
            Toast.makeText(this, "Your Answer is Wrong", Toast.LENGTH_SHORT).show();
        } else if (radioButtonBinding.radioBtn3.isChecked()) {
            Toast.makeText(this, "Your Answer is Wrong", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Your Answer is Correct", Toast.LENGTH_SHORT).show();
        }
    }
}