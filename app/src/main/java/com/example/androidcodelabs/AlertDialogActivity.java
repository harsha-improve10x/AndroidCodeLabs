package com.example.androidcodelabs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivityAlertDialogBinding;

public class AlertDialogActivity extends AppCompatActivity {

    private ActivityAlertDialogBinding alertDialogBinding;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        alertDialogBinding = ActivityAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(alertDialogBinding.getRoot());
        builder = new AlertDialog.Builder(this);
        handleCloseBtn();
    }

    private void handleCloseBtn() {
        alertDialogBinding.closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Welcome to Alert Dialog").setTitle("Alert Dialog");
                builder.setMessage("Do you want to close this application?")
                        .setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                Toast.makeText(AlertDialogActivity.this, "You choose yes action for AlertBox", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                Toast.makeText(AlertDialogActivity.this, "You choose no action for AlertBox", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("AlertDialogMessage");
                alertDialog.show();
            }
        });
    }
}