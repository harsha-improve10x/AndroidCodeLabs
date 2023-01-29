package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.androidcodelabs.databinding.ActivityAutoCompleteTextViewBinding;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityAutoCompleteTextViewBinding autoCompleteTextViewBinding;
    String[] language ={"C","C++","Java",".NET","iPhone","Android","ASP.NET","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        autoCompleteTextViewBinding = ActivityAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(autoCompleteTextViewBinding.getRoot());
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, language);
        autoCompleteTextViewBinding.autoCompleteTextView.setThreshold(1);
        autoCompleteTextViewBinding.autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextViewBinding.autoCompleteTextView.setTextColor(Color.GREEN);
    }
}