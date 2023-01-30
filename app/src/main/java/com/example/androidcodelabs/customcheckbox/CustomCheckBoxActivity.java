package com.example.androidcodelabs.customcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivityCustomCheckBoxBinding;

public class CustomCheckBoxActivity extends AppCompatActivity implements CustomCheckBoxView{

    private ActivityCustomCheckBoxBinding customCheckBoxBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customCheckBoxBinding = ActivityCustomCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(customCheckBoxBinding.getRoot());
        handleOrderBtn();
    }

    @Override
    public void handleOrderBtn() {
        customCheckBoxBinding.orderBtn.setOnClickListener(v -> {
            boolean isPizzaSelected = customCheckBoxBinding.swiggyCb.isChecked();
            boolean isZomatoSelected = customCheckBoxBinding.zomatoCb.isChecked();
            String orderDetails = new CustomCheckBox().createOrderDetails(isPizzaSelected,isZomatoSelected);
            showToast(orderDetails);
        });
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}