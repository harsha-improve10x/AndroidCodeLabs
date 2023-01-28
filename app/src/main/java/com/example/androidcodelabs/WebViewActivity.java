package com.example.androidcodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidcodelabs.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {
    private ActivityWebViewBinding webViewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webViewBinding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(webViewBinding.getRoot());
        webViewBinding.webView.loadUrl("https://improve10x.com/");
    }
}