package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        im=(ImageView) this.findViewById(R.id.imageView2);
        @SuppressLint("ResourceType") Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.anim);
        im.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        },4000);
    }
}