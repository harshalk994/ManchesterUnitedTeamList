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

        //wire the elements
        shopWebView = (WebView)findViewById(R.id.shopView);

        //get the pushed data
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        data = (PlayerData)bundle.getSerializable("Shop data");

        //access the shop url through the getBuy() method and store it in the url String
        String url = data.getBuy();

        //since the website has javascript elements, enable it for webview
        shopWebView.getSettings().setJavaScriptEnabled(true);

        //load the page in webview
        shopWebView.loadUrl(url);
    }
}
