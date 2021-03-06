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

    private TextView textName, textPosition, textJerseyNo, countryView, nationView, ageView, dobView, pldebutView, appView, goalsView, textRatings;
    private ImageView imgView, kitView;
    private Button button, buyButton, moreInfoButton;
    private PlayerData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_relative);

        //wire the elements
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
        moreInfoButton = findViewById(R.id.button4);
        textRatings = findViewById(R.id.ratings);

        //get the pushed data
        final Intent intent = getIntent();
        final Bundle bundle = intent.getExtras();

        data = (PlayerData)bundle.getSerializable("data");

        //populate the fields with data
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
        textRatings.setText(data.getRatings());

        //images are stored in assets folder, user AssetManager to access them
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
                //make an intent to travers to the youtube app and play the video
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(data.getUrl()));
                //start the app
                startActivity(intent1);
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make an intent to traverse and open the shop web view activity
               Intent intent2 = new Intent(TestRelative.this, ShopWebView.class);
               Bundle bundle2 = new Bundle();

               //add data to bundle
               bundle2.putSerializable("Shop data", data);
               intent2.putExtras(bundle2);

                //start activity
                startActivity(intent2);
            }
        });

        moreInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make an intent to traverse and open the Player Statistics activity
                Intent intent3 = new Intent(TestRelative.this, PlayerInfoActivity.class);
                Bundle bundle1 = new Bundle();

                //add data to bundle
                bundle1.putSerializable("data", data);
                intent3.putExtras(bundle1);

                //start the activity
                startActivity(intent3);
            }
        });
    }
}
