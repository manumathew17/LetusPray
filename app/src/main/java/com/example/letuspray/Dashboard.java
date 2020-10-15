package com.example.letuspray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    private CardView prayer, customise, bible, reminder, more, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        prayer=(CardView) findViewById(R.id.dash_prayer);
        customise=(CardView) findViewById(R.id.dash_rosary);
        bible=(CardView) findViewById(R.id.dash_novena);
        reminder=(CardView) findViewById(R.id.way_cross);
        more=(CardView) findViewById(R.id.dash_more);
        info=(CardView) findViewById(R.id.dash_info);

        prayer.setOnClickListener(this);
        customise.setOnClickListener(this);
        bible.setOnClickListener(this);
        reminder.setOnClickListener(this);
        more.setOnClickListener(this);
        info.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.way_cross: i=new Intent(this,Cross_language.class);startActivity(i);break;
            case R.id.dash_prayer: i=new Intent(this,Prayer_languge.class);startActivity(i);break;
            case R.id.dash_rosary: i=new Intent(this,Rosary_languge.class);startActivity(i);break;
            case R.id.dash_novena: i=new Intent(this,Novena_language.class);startActivity(i);break;
            case R.id.dash_more: i=new Intent(this,Alarm_activity.class);startActivity(i);break;

            case R.id.dash_info: i=new Intent(this,Info.class);startActivity(i);break;
            default:break;
        }

    }
}
