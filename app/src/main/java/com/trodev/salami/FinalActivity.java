package com.trodev.salami;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView name, bikash, nogod, upay, rocket, name2, bikash2, nogod2, upay2, rocket2 ;
    ImageView imageView, imageView2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // getSupportActionBar().hide();

        //init views
        name = findViewById(R.id.nameTv);
        bikash = findViewById(R.id.bikashTv);
        nogod = findViewById(R.id. nogodTv);
        upay = findViewById(R.id. upayTv);
        rocket = findViewById(R.id. rocketTv);
        imageView = findViewById(R.id.imageIv);


        //init second view
        name2 = findViewById(R.id.nameTv2);
        bikash2 = findViewById(R.id. bikashTv2);
        imageView2 = findViewById(R.id.imageIv2);
/*        nogod2 = findViewById(R.id. nogodTv2);
        upay2 = findViewById(R.id. upayTv2);
        rocket2 = findViewById(R.id. rocketTv2);*/

        String surename = getIntent().getStringExtra("surename");
        String surebikash = getIntent().getStringExtra("surebikash");
        String surenogod = getIntent().getStringExtra("surenogod");
        String sureupay = getIntent().getStringExtra("sureupay");
        String surerocket = getIntent().getStringExtra("surerocket");

        byte[] bytes = getIntent().getByteArrayExtra("avater");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

        // set all  data on textview and imageview.
        name.setText(surename);
        bikash.setText(surebikash);
        nogod.setText(surenogod);
        upay.setText(sureupay);
        rocket.setText(surerocket);
        imageView.setImageBitmap(bitmap);
        imageView2.setImageBitmap(bitmap);

        name2.setText(surename);
        bikash2.setText(surebikash);

    }
}