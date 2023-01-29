package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.androidcodelabs.databinding.ActivitySearchViewToolBarBinding;

import java.util.ArrayList;

public class SearchViewToolBarActivity extends AppCompatActivity {

    private ActivitySearchViewToolBarBinding searchViewToolBarBinding;
    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchViewToolBarBinding = ActivitySearchViewToolBarBinding.inflate(getLayoutInflater());
        setContentView(searchViewToolBarBinding.getRoot());
        listView = (ListView) searchViewToolBarBinding.searchToolbarLv;

        arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("PineApple");
        arrayList.add("Orange");
        arrayList.add("Guava");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.search_view_toolbar_menu, menu);
        MenuItem item = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}