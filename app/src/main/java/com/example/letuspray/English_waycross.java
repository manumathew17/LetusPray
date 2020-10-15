package com.example.letuspray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class English_waycross extends AppCompatActivity implements View.OnClickListener{
    private CardView r1, r2, r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_waycross);

        r1=(CardView) findViewById(R.id.e_w_preperation);
        r2=(CardView) findViewById(R.id.e_w_decades);
        r3=(CardView) findViewById(R.id.e_w_conclude);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.e_w_preperation: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_w_preperatory.html");
                i.putExtra("heading","Preparatory prayer");
                startActivity(i);
                break;

            case R.id.e_w_decades: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_w_station.html");
                i.putExtra("heading","Stations");
                startActivity(i);
                break;

            case R.id.e_w_conclude: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_w_conclusion.html");
                i.putExtra("heading","Concluding prayer");
                startActivity(i);
                break;
            default:break;
        }

    }
}
