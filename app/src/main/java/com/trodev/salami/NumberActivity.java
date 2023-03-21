package com.trodev.salami;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class NumberActivity extends AppCompatActivity {

    private EditText bkash, nogod, upay, rocket;
    private Button button;
    private TextView nameTv;
    private ImageView imageIv;
    private ImageButton backBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        //hide top banner
        getSupportActionBar().hide();

        //init views
        bkash = findViewById(R.id. bikashEt);
        nogod = findViewById(R.id. nogodEt);
        upay = findViewById(R.id. upayEt);
        rocket = findViewById(R.id. rocketEt);
        nameTv = findViewById(R.id. nameTv);
        imageIv = findViewById(R.id. imageIv);
        button = findViewById(R.id. addBtn);
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String surebikash = bkash.getText().toString().trim();
                String surenogod = nogod.getText().toString().trim();
                String sureupay = upay.getText().toString().trim();
                String surerocket = rocket.getText().toString().trim();
                String names = nameTv.getText().toString().trim();

                Intent intent = new Intent(NumberActivity.this, FinalActivity.class);
                intent.putExtra("surename", names);
                intent.putExtra("surebikash", surebikash);
                intent.putExtra("surenogod", surenogod);
                intent.putExtra("sureupay", sureupay);
                intent.putExtra("surerocket", surerocket);
                intent.putExtra("avater", imageViewToByte());

                startActivity(intent);
            }
        });

        String surename = getIntent().getStringExtra("surename");
        nameTv.setText(surename);

        byte[] bytes = getIntent().getByteArrayExtra("avater");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        imageIv.setImageBitmap(bitmap);

    }

    private byte[] imageViewToByte() {

        Bitmap bitmap = ((BitmapDrawable) imageIv.getDrawable()).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();

        return bytes;
    }
}