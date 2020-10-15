package com.example.letuspray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 4000;
    Animation topAnim, bottomAnim;
    TextView logo, slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    topAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
    bottomAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_slogan);


    logo=findViewById(R.id.textView);
    slogan=findViewById(R.id.textView2);

    logo.setAnimation(topAnim);
    slogan.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_SCREEN);
    }
}
