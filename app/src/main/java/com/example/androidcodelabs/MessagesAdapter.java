package com.example.androidcodelabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.androidcodelabs.databinding.MessageFileLayoutBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MessagesAdapter extends ArrayAdapter<Message> {
    public MessagesAdapter(@NonNull Context context, int resource, @NonNull List<Message> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MessageFileLayoutBinding binding = MessageFileLayoutBinding.inflate(LayoutInflater.from(getContext()), parent, false);
        Message item = getItem(position);
        binding.nameTxt.setText(item.name);
        binding.messageTxt.setText(item.message);
        Picasso.get().load(item.imageView).into(binding.profileIv);
        return binding.getRoot();
    }
}
