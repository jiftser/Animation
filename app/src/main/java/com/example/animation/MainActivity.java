package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgFrame = (ImageView)findViewById(R.id.imgLights);
        imgFrame.setBackgroundResource(R.drawable.animation);
        anim = (AnimationDrawable)imgFrame.getBackground();
        Button bttn1 = (Button)findViewById(R.id.btnStart);
        Button bttn2 = (Button)findViewById(R.id.btnStop);

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim.start();
            }
        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim.stop();
                startActivity(new Intent(MainActivity.this, Tween.class));
            }
        });
    }
}
