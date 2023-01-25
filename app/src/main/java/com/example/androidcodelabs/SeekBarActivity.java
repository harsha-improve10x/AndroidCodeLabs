package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivitySeekBarBinding;

public class SeekBarActivity extends AppCompatActivity {

    private ActivitySeekBarBinding seekBarBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        seekBarBinding = ActivitySeekBarBinding.inflate(getLayoutInflater());
        setContentView(seekBarBinding.getRoot());
        getSupportActionBar().setTitle("Seek Bar");
        seekBarBinding.seekBarSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(SeekBarActivity.this, "Seekbar progress: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "Seekbar touch started!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "Seekbar touch stopped!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}