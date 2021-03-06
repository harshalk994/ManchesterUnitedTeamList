package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
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
    private Button button;
    private PlayerData data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_info);

        //wire the widgets
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
        button = findViewById(R.id.button3);

        //get the pushed data
        final Intent intent = getIntent();
        final Bundle bundle = intent.getExtras();
        data = (PlayerData)bundle.getSerializable("data");

        //populate the fields with data
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

        //images are stored in asset folder, use AssetManager to access and set the field
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

        //deal with the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to transfer data to next activity
                Intent intent4 = new Intent(PlayerInfoActivity.this, WebViewActivity.class);
                Bundle bundle5 = new Bundle();
                bundle5.putSerializable("data", data);
                intent4.putExtras(bundle5);

                startActivity(intent4);
            }
        });
    }
}
