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
        ImageView imageCountry = view.findViewById(R.id.imageView5);


        PlayerData playerData = playerDataList.get(position);
        textViewName.setText(playerData.getName());
        Log.e("%%%%%",playerData.getName());
        textViewPosition.setText(playerData.getPosition());
       // imageViewPlayers.setImageDrawable(myCtx.getResources().getDrawable(Integer.parseInt(playerData.getImage())));
        //imageCountry.setImageDrawable(myCtx.getResources().getDrawable(Integer.parseInt(playerData.getCountry())));

        AssetManager assetManager = myCtx.getAssets();
        Bitmap bitmap, bitmaps;
        InputStream is, cs;
        try {
            Log.e("$$$$$","******");
            is = assetManager.open(playerData.getId()+"/" + playerData.getImage());
            cs = assetManager.open(playerData.getId()+"/"+playerData.getCountry());
            //Bitmap bitmap, bitmaps;
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

        /*AssetManager assetManager1 = myCtx.getAssets();
        try {
            cs = assetManager.open(playerData.getId()+"/"+playerData.getCountry());
            bitmaps = BitmapFactory.decodeStream(cs);
            imageCountry.setImageBitmap(bitmaps);
        } catch (IOException e) {
            e.printStackTrace();
            Writer writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            String s = writer.toString();
            Log.e("Exception", s);
        }*/

        return view;
    }
}
