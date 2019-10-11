package com.example.manchesterunitedteamlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class TestRelative extends AppCompatActivity {

    private TextView textName, textPosition, textJerseyNo, countryView, nationView, ageView, dobView, pldebutView, appView, goalsView;
    private ImageView imgView, kitView;
    private Button button, buyButton;
    private PlayerData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_relative);



        textName = findViewById(R.id.textView8);
        textPosition = findViewById(R.id.textView2);
        textJerseyNo = findViewById(R.id.textView4);
        imgView = findViewById(R.id.imageView2);
        button = findViewById(R.id.button2);
        countryView = findViewById(R.id.textView11);
        nationView = findViewById(R.id.textView18);
        ageView = findViewById(R.id.textView19);
        dobView = findViewById(R.id.textView20);
        pldebutView = findViewById(R.id.textView21);
        appView = findViewById(R.id.textView22);
        goalsView = findViewById(R.id.textView23);
        kitView = findViewById(R.id.imageView6);
        buyButton = findViewById(R.id.button5);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        data = (PlayerData)bundle.getSerializable("data");

        textName.setText(data.getName());
        textPosition.setText(data.getPosition());
        textJerseyNo.setText(data.getJerseyNo());
        countryView.setText(data.getCob());
        nationView.setText(data.getNteam());
        ageView.setText(data.getAge());
        dobView.setText(data.getDob());
        pldebutView.setText(data.getDebut());
        appView.setText(data.getApps());
        goalsView.setText(data.getGoals());


        AssetManager assetManager = getAssets();
        Bitmap bitmap,bitmap1;
        InputStream is, is2;
        try {
            Log.e("$$$$$","******");
            is = assetManager.open(data.getId()+"/" + data.getImageOnClick());
            bitmap = BitmapFactory.decodeStream(is);
            is2 = assetManager.open(data.getId()+"/" + data.getKit());
            bitmap1 = BitmapFactory.decodeStream(is2);

            imgView.setImageBitmap(bitmap);
            kitView.setImageBitmap(bitmap1);

        } catch (IOException e) {
            e.printStackTrace();
            Writer writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            String s = writer.toString();
            Log.e("Exception", s);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(data.getUrl()));

                startActivity(intent1);
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(data.getBuy()));

                startActivity(intent2);
            }
        });
    }
}
