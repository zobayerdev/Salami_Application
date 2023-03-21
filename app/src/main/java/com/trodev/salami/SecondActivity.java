package com.trodev.salami;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView name, phone;
    ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // getSupportActionBar().hide();

        //init views
        name = findViewById(R.id.nameTv);
        phone = findViewById(R.id.phoneTv);
        imageView = findViewById(R.id.imageIv);

        String surename = getIntent().getStringExtra("surename");
        String surephone = getIntent().getStringExtra("surephone");

        byte[] bytes = getIntent().getByteArrayExtra("avater");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

        // set all  data on textview and imageview.
        name.setText(surename);
        phone.setText(surephone);
        imageView.setImageBitmap(bitmap);

    }
}