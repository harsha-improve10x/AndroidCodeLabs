package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.example.androidcodelabs.databinding.ActivityMultiAutoCompleteTextViewBinding;

public class MultiAutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityMultiAutoCompleteTextViewBinding multiAutoCompleteTextViewBinding;
    String[] androidVersionNames = {"Aestro", "Blender", "CupCake", "Donut", "Eclair",
            "Froyo", "Gingerbread", "HoneyComb", "IceCream Sandwich", "Jellibean",
            "Kitkat", "Lollipop", "MarshMallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        multiAutoCompleteTextViewBinding = ActivityMultiAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(multiAutoCompleteTextViewBinding.getRoot());
        getSupportActionBar().setTitle("Multi AutoComplete TextView");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, androidVersionNames);
        multiAutoCompleteTextViewBinding.simpleMultiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextViewBinding.simpleMultiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextViewBinding.simpleMultiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}