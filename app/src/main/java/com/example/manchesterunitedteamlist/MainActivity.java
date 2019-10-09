package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button playerButton = null;
    //private Button staffButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //wire the elements
        playerButton = findViewById(R.id.button);
        //staffButton = findViewById(R.id.button2);

        //deal with button
        playerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make an intent to go to the playerlist activity
                Intent i = new Intent(MainActivity.this, PlayerListActivity.class);
                startActivity(i);
            }
        });
    }

}
