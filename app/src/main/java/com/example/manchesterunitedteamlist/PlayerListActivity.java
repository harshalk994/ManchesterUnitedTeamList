package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
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
    private ListView list ;
   // private ArrayAdapter<PlayerData> adapter = null;
    private PlayerXMLData data ;
   // private PlayerAdapter adapter = null;
   // private ArrayList<PlayerData> players ;
    List<PlayerData> players;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);
        players = new ArrayList<>();
        data = new PlayerXMLData(getApplicationContext());
        Log.e("&&&&",Integer.toString(data.getLength()));

         for(int i=0; i<data.getLength(); i++){
             players.add(data.getPlayerData(i));
            Log.e("***",data.getPlayerData(0).getName());
       }
        Log.e("***",data.getPlayerData(0).getName());

        list = (ListView) findViewById(R.id.listView);

      PlayerAdapter  adapter = new PlayerAdapter(this,R.layout.playerview,players);
        //link the adapter



        list.setAdapter(adapter);

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
