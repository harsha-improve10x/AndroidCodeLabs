package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivityTextWatcherBinding;

public class TextWatcherActivity extends AppCompatActivity {

    private ActivityTextWatcherBinding textWatcherBinding;
    private ListView listView;
    private EditText editText;
    private ArrayAdapter<String> adapter;
    private String products[] = {"Apple", "Banana","Pineapple", "Orange", "Papaya", "Melon",
            "Grapes", "Water Melon","Lychee", "Guava", "Mango", "Kivi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textWatcherBinding = ActivityTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(textWatcherBinding.getRoot());
        getSupportActionBar().setTitle("Text Watcher");
        listView = (ListView) textWatcherBinding.watcherLv;
        editText = (EditText) textWatcherBinding.watcherTxt;
        adapter = new ArrayAdapter<String>(this, R.layout.text_watcher_file_layout,
                R.id.product_name,products);
        listView.setAdapter(adapter);
        setTextWatcherBinding();
    }

    private void setTextWatcherBinding() {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(TextWatcherActivity.this, "Before Text Change", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(TextWatcherActivity.this, "After Text Change", Toast.LENGTH_SHORT).show();
            }
        });
    }
}