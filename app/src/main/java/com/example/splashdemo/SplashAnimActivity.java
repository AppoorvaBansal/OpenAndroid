package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashAnimActivity extends AppCompatActivity {

    AnimationDrawable ad;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_anim);

        img=findViewById(R.id.imgsplashscreen);
        img.setBackgroundResource(R.drawable.imgslideshow);
        ad=(AnimationDrawable)img.getBackground();
        ad.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashAnimActivity.this,HomeActivity.class);
                startActivity(i);

                finish();
            }
        },4000);

    }
}
