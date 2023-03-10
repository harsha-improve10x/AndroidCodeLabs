package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidcodelabs.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    private ActivityCustomListViewBinding activityListViewBinding;
    private ArrayList<Message> messages;
    MessagesAdapter messagesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityListViewBinding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        setContentView(activityListViewBinding.getRoot());
        getSupportActionBar().setTitle("List View");
        setData();
        setMessagesLv();
    }

    private void setData() {
        messages = new ArrayList<>();

        Message harsha = new Message();
        harsha.name = "ShreeHarsha A";
        harsha.message = "Welcome to Improve 10X";
        harsha.imageView = "https://www.shutterstock.com/image-photo/portrait-smiling-red-haired-millennial-260nw-1194497251.jpg";
        messages.add(harsha);

        Message manoj = new Message();
        manoj.name = "Manoj M";
        manoj.message = "Hi, Welcome to Improve 10X";
        harsha.imageView = "https://www.shutterstock.com/image-photo/portrait-smiling-red-haired-millennial-260nw-1194497251.jpg";
        messages.add(manoj);
    }

    private void setMessagesLv() {
        messagesAdapter = new MessagesAdapter(this, R.layout.activity_custom_list_view, messages);
        activityListViewBinding.messagesLv.setAdapter(messagesAdapter);
    }
}