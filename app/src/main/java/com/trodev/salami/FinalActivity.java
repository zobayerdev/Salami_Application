package com.trodev.salami;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView name, bikash, nogod, upay, rocket;
    ImageView imageView;

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

    }
}