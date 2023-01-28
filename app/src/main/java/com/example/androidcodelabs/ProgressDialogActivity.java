package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.example.androidcodelabs.databinding.ActivityProgressDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {

    private ActivityProgressDialogBinding progressDialogBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        progressDialogBinding = ActivityProgressDialogBinding.inflate(getLayoutInflater());
        setContentView(progressDialogBinding.getRoot());
        handleClickBtn();
    }

    private void handleClickBtn() {
        progressDialogBinding.clickBtn.setOnClickListener(v -> {
           ProgressDialog builder = new ProgressDialog(this);
            builder.setTitle("This is Title");
            builder.setMessage("This is Message");
            builder.show();
        });
    }
}