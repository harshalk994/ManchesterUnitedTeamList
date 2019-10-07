package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PlayerListActivity extends AppCompatActivity {

     /*String [] playerNames = {"David De Gea", "Harry Maguire", "Ashley Young", "Paul Pogba", "Scott McTominay", "Anthony Martial", "Marcus Rashford"};
     String [] playerPositions = {"GK", "CD", "RB", "CDM", "CDM", "RS", "LS"};
     public int [] playerImages = {R.drawable.degeasquad, R.drawable.harrymaguiresquad, R.drawable.ashleyyoung, R.drawable.paulpogbasquad, R.drawable.scottmctominaysquad,
            R.drawable.anthonymartialsquad, R.drawable.marcusrashfordsquad};*/
    private ListView list = null;
    private List<PlayerData> playerDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);

        list = findViewById(R.id.listView);

        playerDataList = new ArrayList<>();

        playerDataList.add(new PlayerData(R.drawable.degeasquad, "David De Gea", "Goalkeeper"));
        playerDataList.add(new PlayerData(R.drawable.harrymaguiresquad, "Harry Maguire", "Central Defender"));
        playerDataList.add(new PlayerData(R.drawable.ashleyyoung, "Ashley Young", "Right Back"));
        playerDataList.add(new PlayerData(R.drawable.paulpogbasquad, "Paul Pogba", "Central Midfielder"));
        playerDataList.add(new PlayerData(R.drawable.scottmctominaysquad, "Scott McTominay", "Defensive Midfielder"));
        playerDataList.add(new PlayerData(R.drawable.anthonymartialsquad, "Anthony Martial", "Right Striker"));
        playerDataList.add(new PlayerData(R.drawable.marcusrashfordsquad, "Marcus Rashford", "Left Striker"));

        PlayerAdapter adapter = new PlayerAdapter(this, R.layout.playerview, playerDataList);

        list.setAdapter(adapter);
        //link the adapter


          //simple list implemented below, you can scroll down after entire code you will find the list


    }
}




/*  adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                playernames
        );

        list.setAdapter(adapter);

        //list item click
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PlayerListActivity.this,"Clicked on " + playernames[i], Toast.LENGTH_SHORT).show();
            }
        });*/
