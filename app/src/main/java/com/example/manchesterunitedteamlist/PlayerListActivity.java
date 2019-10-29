package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
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

    private ListView list ;
    private PlayerXMLData data ;
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

         //wire the elements
         list = (ListView) findViewById(R.id.listView);

     //set the adapter
      PlayerAdapter  adapter = new PlayerAdapter(this,R.layout.playerview,players);

      //link the adapter
        list.setAdapter(adapter);

        //on clicking the item in list, it should open the respective player's info in new activity
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //make intent and bundle
                Intent intent = new Intent(PlayerListActivity.this, TestRelative.class);
                Bundle bundle = new Bundle();

                ////add data to bundle
                bundle.putSerializable("data", data.getPlayerData(i));
                intent.putExtras(bundle);

                //start the activity
                startActivity(intent);

            }
        });

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
