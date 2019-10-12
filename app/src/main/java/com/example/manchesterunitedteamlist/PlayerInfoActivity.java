package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class PlayerInfoActivity extends AppCompatActivity {

    private TextView textViewA, textViewM, textViewN, textViewO, textViewP, textViewQ, textViewR, textViewS, textViewT,
            textViewU, textViewV, textViewW, textViewX;
    private ImageView imageView;
    private PlayerData data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_info);

        textViewA = findViewById(R.id.textView50);
        textViewM = findViewById(R.id.textView36);
        textViewN = findViewById(R.id.textView37);
        textViewO = findViewById(R.id.textView38);
        textViewP = findViewById(R.id.textView39);
        textViewQ = findViewById(R.id.textView40);
        textViewR = findViewById(R.id.textView41);
        textViewS = findViewById(R.id.textView42);
        textViewT = findViewById(R.id.textView43);
        textViewU = findViewById(R.id.textView44);
        textViewV = findViewById(R.id.textView45);
        textViewW = findViewById(R.id.textView48);
        textViewX = findViewById(R.id.textView49);
        imageView = findViewById(R.id.imageView7);

        final Intent intent = getIntent();
        final Bundle bundle = intent.getExtras();

        data = (PlayerData)bundle.getSerializable("data");

        textViewA.setText(data.getName());
        textViewM.setText(data.getChampion());
        textViewN.setText(data.getWins());
        textViewO.setText(data.getLosses());
        textViewP.setText(data.getCleans());
        textViewQ.setText(data.getOg());
        textViewR.setText(data.getAssists());
        textViewS.setText(data.getPasses());
        textViewT.setText(data.getCrosses());
        textViewU.setText(data.getThrough());
        textViewV.setText(data.getFouls());
        textViewW.setText(data.getYellowc());
        textViewX.setText(data.getRedc());

       AssetManager assetManager = getAssets();
        Bitmap bitmap;
        InputStream is;
        try {
            Log.e("$$$$$","******");
            is = assetManager.open(data.getId()+"/" + data.getImageOnClick());
            bitmap = BitmapFactory.decodeStream(is);

            imageView.setImageBitmap(bitmap);


        } catch (IOException e) {
            e.printStackTrace();
            Writer writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            String s = writer.toString();
            Log.e("Exception", s);
        }


    }
}
