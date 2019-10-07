package com.example.manchesterunitedteamlist;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PlayerAdapter extends ArrayAdapter<PlayerData> {

    Context myCtx;
    int resource;
    List<PlayerData> playerDataList;

    public PlayerAdapter(Context myCtx, int resource, List<PlayerData> playerDataList){
        super(myCtx, resource, playerDataList);
        this.myCtx = myCtx;
        this.resource = resource;
        this.playerDataList = playerDataList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(myCtx);

        View view = inflater.inflate(R.layout.playerview, null);

        TextView textViewName = view.findViewById(R.id.textView6);
        TextView textViewPosition = view.findViewById(R.id.textView7);
        ImageView imageViewPlayers = view.findViewById(R.id.imageView);

        PlayerData playerData = playerDataList.get(position);
        textViewName.setText(playerData.getName());
        textViewPosition.setText(playerData.getPosition());
        imageViewPlayers.setImageDrawable(myCtx.getResources().getDrawable(playerData.getImage()));

        return view;
    }
}
