package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    private PlayerData data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //wire the elements
        webView = (WebView)findViewById(R.id.webView1);

        //get the pushed data
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        data = (PlayerData)bundle.getSerializable("data");

        //access the manchester united website url through the getWeburl() method and store it in the url String
        String url = data.getWeburl();

        //since the website has javascript elements, enable it for webview
        webView.getSettings().setJavaScriptEnabled(true);

        //load the page in webview
        webView.loadUrl(url);



    }
}
