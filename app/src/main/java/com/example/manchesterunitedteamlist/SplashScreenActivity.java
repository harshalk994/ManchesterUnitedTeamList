package com.example.manchesterunitedteamlist;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    @RequiresApi(api = Build.VERSION_CODES.P)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //make an intent to traverse from splash screen to the custom list
                Intent intent = new Intent(SplashScreenActivity.this, PlayerListActivity.class);
                startActivity(intent);

                //do not allow user to go back to the splash screen on hitting the back button
                finish();
            }
        },SPLASH_TIME_OUT);


    }
}
