package com.example.letuspray;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Prayer_languge extends AppCompatActivity implements View.OnClickListener {
    private CardView english,malayalam,kannada,hindi;

    // so our images and other things are set in array

    // now paste some images in drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer_languge);

        english=(CardView) findViewById(R.id.english_prayer);
        malayalam=(CardView) findViewById(R.id.malayalm_prayer);

        hindi=(CardView) findViewById(R.id.hindi_prayer);


        english.setOnClickListener(this);
        malayalam.setOnClickListener(this);

        hindi.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.english_prayer: i=new Intent(this,English_prayers.class);startActivity(i);break;

            default:break;
        }

    }
}


    



