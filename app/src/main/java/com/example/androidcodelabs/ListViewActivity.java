package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivityCustomListViewBinding;
import com.example.androidcodelabs.databinding.ActivityListView2Binding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListView2Binding listView2Binding;
    private ArrayList<String> stringArrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView2Binding = ActivityListView2Binding.inflate(getLayoutInflater());
        setContentView(listView2Binding.getRoot());
        setData();
        listViewAdapter();
    }

    private void setData() {
        stringArrayList = new ArrayList<>();

        stringArrayList.add("harsha");
        stringArrayList.add("prakash");
        stringArrayList.add("Rajesh");
        stringArrayList.add("Suresh");
        stringArrayList.add("Anupama");
    }

    private void listViewAdapter() {
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stringArrayList);
        listView2Binding.namesListView.setAdapter(arrayAdapter);
        listView2Binding.namesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, String.valueOf(stringArrayList), Toast.LENGTH_SHORT).show();
            }
        });
    }
}