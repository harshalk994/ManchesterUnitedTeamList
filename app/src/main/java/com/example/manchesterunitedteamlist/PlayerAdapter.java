package com.example.manchesterunitedteamlist;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class PlayerAdapter extends ArrayAdapter<PlayerData> {

    Context myCtx;
    int resource;
    List<PlayerData> playerDataList;

    //override the ArrayAdapter constructor
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

        //create and inflate the view with the playerview.xml layout
        View view = inflater.inflate(R.layout.playerview, null);

        //wiring the widgets
        TextView textViewName = view.findViewById(R.id.textView6);
        TextView textViewPosition = view.findViewById(R.id.textView7);
        ImageView imageViewPlayers = view.findViewById(R.id.imageView);
        ImageView imageCountry = view.findViewById(R.id.imageView5);


        PlayerData playerData = playerDataList.get(position);
        textViewName.setText(playerData.getName());
        Log.e("%%%%%",playerData.getName());
        textViewPosition.setText(playerData.getPosition());

        //images are stored in assets folder, accessing the images from it using AssetManager
        AssetManager assetManager = myCtx.getAssets();
        Bitmap bitmap, bitmaps;
        InputStream is, cs;
        try {
            Log.e("$$$$$","******");
            is = assetManager.open(playerData.getId()+"/" + playerData.getImage());
            cs = assetManager.open(playerData.getId()+"/"+playerData.getCountry());
            bitmap = BitmapFactory.decodeStream(is);
            bitmaps = BitmapFactory.decodeStream(cs);
            imageViewPlayers.setImageBitmap(bitmap);
            imageCountry.setImageBitmap(bitmaps);
        } catch (IOException e) {
            e.printStackTrace();
            Writer writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            String s = writer.toString();
            Log.e("Exception", s);
        }

        //return the view to the custom list
        return view;
    }
}
