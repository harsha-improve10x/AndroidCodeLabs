package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidcodelabs.databinding.ActivitySearchViewBinding;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {

    private ActivitySearchViewBinding searchViewBinding;
    private SearchView searchView;
    private ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchViewBinding = ActivitySearchViewBinding.inflate(getLayoutInflater());
        setContentView(searchViewBinding.getRoot());
        getSupportActionBar().setTitle("Search View");
        listView = (ListView) searchViewBinding.searchListView;
        setSearchView();
    }

    private void setSearchView() {
        list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Papaya");
        list.add("Watermelon");
        list.add("Grapes");
        list.add("Orange");
        list.add("Guava");
        list.add("PineApple");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        searchViewBinding.searchSv.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (list.contains(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(SearchViewActivity.this, "No match Found",
                            Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }
}