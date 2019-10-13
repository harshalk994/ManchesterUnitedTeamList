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

        webView = (WebView)findViewById(R.id.webView1);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        data = (PlayerData)bundle.getSerializable("data");

        String url = data.getWeburl();

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(url);



    }
}
