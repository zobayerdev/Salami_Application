package com.trodev.salami;

import static com.trodev.salami.R.color.red;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class FinalActivity extends AppCompatActivity {

    // textview from all user
    TextView name, bikash, nogod, upay, rocket;
    TextView name2, bikash2, nogod2, upay2, rocket2;
    TextView name3, bikash3, nogod3, upay3, rocket3;
    TextView name4, bikash4, nogod4, upay4, rocket4;
    TextView name5, bikash5, nogod5, upay5, rocket5;
    TextView name6, bikash6, nogod6, upay6, rocket6;

    //icon for user image
    ImageView imageView, imageView2, imageIv3, imageIv4, imageIv5, imageIv6, imageIv7, imageIv8, imageIv9, imageIv10;

    // ##############################
    // navigation drawerlayout methods
    private BottomNavigationView bottomNavigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    private long pressedTime;

    @SuppressLint({"MissingInflatedId", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigation_view);


        // #######################
        // Drawer Layout implement
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // #################################################################
        // eikhane eituku hocche amader navigation layout er kaj korar jonno.
        navigationView.setNavigationItemSelectedListener(this::onOptionsItemSelected);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        //init views
        name = findViewById(R.id.nameTv);
        bikash = findViewById(R.id.bikashTv);
/*        nogod = findViewById(R.id. nogodTv);
        upay = findViewById(R.id. upayTv);
        rocket = findViewById(R.id. rocketTv);*/
        imageView = findViewById(R.id.imageIv);


        //init second view
        name2 = findViewById(R.id.nameTv2);
        bikash2 = findViewById(R.id.bikashTv2);
        imageView2 = findViewById(R.id.imageIv2);
        /*  nogod2 = findViewById(R.id. nogodTv2);
          upay2 = findViewById(R.id. upayTv2);
        rocket2 = findViewById(R.id. rocketTv2);*/


        //init third value
        name3 = findViewById(R.id.nameTv3);
        imageIv3 = findViewById(R.id.imageIv3);
        bikash3 = findViewById(R.id.bikashTv3);
/*     nogod3 = findViewById(R.id. nogodTv3);
        upay3 = findViewById(R.id.upayTv3);
        rocket3 = findViewById(R.id.rocketTv3);
        bikashIv3 = findViewById(R.id. bikashIv3);*/

        //init fourth value
        name4 = findViewById(R.id.nameTv4);
        imageIv4 = findViewById(R.id.imageIv4);
        bikash4 = findViewById(R.id.bikashTv4);

        // init fifth value
        name5 = findViewById(R.id.nameTv5);
        imageIv5 = findViewById(R.id.imageIv5);
        bikash5 = findViewById(R.id.bikashTv5);


        // init six value
        name6 = findViewById(R.id.nameTv6);
        imageIv6 = findViewById(R.id.imageIv6);
        bikash6 = findViewById(R.id.bikashTv6);


        // get all data from another activity
        String surename = getIntent().getStringExtra("surename");
        String surebikash = getIntent().getStringExtra("surebikash");
        String surenogod = getIntent().getStringExtra("surenogod");
        String sureupay = getIntent().getStringExtra("sureupay");
        String surerocket = getIntent().getStringExtra("surerocket");

        byte[] bytes = getIntent().getByteArrayExtra("avater");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);


        // set all  data on textview and imageview.
        name.setText(surename);
        imageView.setImageBitmap(bitmap);
        bikash.setText(surebikash);
/*        nogod.setText(surenogod);
        upay.setText(sureupay);
        rocket.setText(surerocket);*/

        //set value on second
        name2.setText(surename);
        bikash2.setText(surebikash);
        imageView2.setImageBitmap(bitmap);


        //set value in third
        name3.setText(surename);
        imageIv3.setImageBitmap(bitmap);
        bikash3.setText(surebikash);
/*     nogod3.setText(surenogod);
        upay3.setText(sureupay);
        rocket3.setText(surerocket);*/


        //set value on fourth
        name4.setText(surename);
        imageIv4.setImageBitmap(bitmap);
        bikash4.setText(surebikash);


        //set value on fifth
        name5.setText(surename);
        imageIv5.setImageBitmap(bitmap);
        bikash5.setText(surebikash);

        //set value on six
        name6.setText(surename);
        imageIv6.setImageBitmap(bitmap);
        bikash6.setText(surebikash);


    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {
            case R.id.nav_notification_notice:
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_dev:
/*                final Dialog dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.developer_bottomsheet_layout);

                dialog.show();
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
                dialog.getWindow().setGravity(Gravity.BOTTOM);*/
                Toast.makeText(this, "Developer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_policy:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.app-privacy-policy.com/live.php?token=qB3iS10fUJmr6yEFtaVo9yve0uuPP3Ok")));
                Toast.makeText(this, "Privacy Policy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Eid Salami");
                    String shareMessage = "\nEid Salami অ্যাপটি ডাউনলোড করুন\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                    Toast.makeText(this, "Share us", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    //e.toString();
                }
                break;
            case R.id.nav_rate:
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
                    Toast.makeText(this, "Rate Us", Toast.LENGTH_SHORT).show();
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}