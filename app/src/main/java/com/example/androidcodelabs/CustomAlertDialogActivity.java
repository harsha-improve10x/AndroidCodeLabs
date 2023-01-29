package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivityCustomAlertDialogBinding;
import com.example.androidcodelabs.databinding.ActivityCustomListViewBinding;
import com.example.androidcodelabs.databinding.CustomAlertDialogItemLayoutBinding;

public class CustomAlertDialogActivity extends AppCompatActivity {
    private ActivityCustomAlertDialogBinding customAlertDialogBinding;
    private CustomAlertDialogItemLayoutBinding customAlertDialogItemLayoutBinding;
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customAlertDialogBinding = ActivityCustomAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(customAlertDialogBinding.getRoot());
        getSupportActionBar().setTitle("Custom Alert Dialog");
        handleClickBtn();
    }

    private void handleClickBtn() {
        customAlertDialogBinding.alertClickBtn.setOnClickListener(v -> {
            dialog = new Dialog(this);
            customAlertDialogItemLayoutBinding = CustomAlertDialogItemLayoutBinding.inflate(getLayoutInflater());
            dialog.setContentView(customAlertDialogItemLayoutBinding.getRoot());
            customAlertDialogItemLayoutBinding.dismissBtn.setOnClickListener(v1 -> {
                finish();
            });
            customAlertDialogItemLayoutBinding.image.setOnClickListener(v1 -> {
                dialog.dismiss();
            });
            customAlertDialogItemLayoutBinding.text.setText("Alert..!!");
            dialog.show();
        });
    }
}