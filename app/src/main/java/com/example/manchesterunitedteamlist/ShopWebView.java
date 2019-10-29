package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class ShopWebView extends AppCompatActivity {

    private WebView shopWebView;
    private PlayerData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_web_view);

        shopWebView = (WebView)findViewById(R.id.shopView);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        data = (PlayerData)bundle.getSerializable("Shop data");

        String url = data.getBuy();

        shopWebView.getSettings().setJavaScriptEnabled(true);

        shopWebView.loadUrl(url);
    }
}
