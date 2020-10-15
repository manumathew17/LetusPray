package com.example.letuspray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Rosary_languge extends AppCompatActivity implements View.OnClickListener {
    private CardView english,malayalam,kannada,hindi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rosary_languge);

        english=(CardView) findViewById(R.id.english_rosary);
        malayalam=(CardView) findViewById(R.id.malayalm_rosary);

        hindi=(CardView) findViewById(R.id.hindi_rosary);

        english.setOnClickListener(this);
        malayalam.setOnClickListener(this);

        hindi.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.english_rosary: i=new Intent(this,English_rosary.class);startActivity(i);break;

            case R.id.malayalm_rosary: i=new Intent(this,Malayalam_rosary.class);startActivity(i);break;
            case R.id.hindi_rosary: i=new Intent(this,Hindi_rosary.class);startActivity(i);break;

            default:break;

        }

    }
}
