package com.example.letuspray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


public class English_prayers extends AppCompatActivity implements View.OnClickListener{
    private CardView p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_prayers);

        p1=(CardView) findViewById(R.id.signofcross);
        p2=(CardView) findViewById(R.id.ourfather);
        p3=(CardView) findViewById(R.id.hailmary);
        p4=(CardView) findViewById(R.id.the_angelus);
        p5=(CardView) findViewById(R.id.apostoles_creed);
        p6=(CardView) findViewById(R.id.cenfession1);
        p7=(CardView) findViewById(R.id.confesion2);
        p8=(CardView) findViewById(R.id.before_eating);
        p9=(CardView) findViewById(R.id.after_eating);
        p10=(CardView) findViewById(R.id.holy_queen);
        p11=(CardView) findViewById(R.id.memorare);

        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);
        p7.setOnClickListener(this);
        p8.setOnClickListener(this);
        p9.setOnClickListener(this);
        p10.setOnClickListener(this);
        p11.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.signofcross: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_signofcross.html");
                i.putExtra("heading","Sign of cross");
                startActivity(i);
                break;

            case R.id.ourfather: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_ourfather.html");
                i.putExtra("heading","Our father");
                startActivity(i);
                break;

            case R.id.the_angelus: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_theangelus.html");
                i.putExtra("heading","The angelus");
                startActivity(i);
                break;
            case R.id.apostoles_creed: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_apostoliccreed.html");
                i.putExtra("heading","Apostolic creed");
                startActivity(i);
                break;
            case R.id.cenfession1: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_bconfession.html");
                i.putExtra("heading","Before confession");
                startActivity(i);
                break;
            case R.id.confesion2: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_aconfession.html");
                i.putExtra("heading","After confession");
                startActivity(i);
                break;
            case R.id.before_eating: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_beating.html");
                i.putExtra("heading","Before eating");
                startActivity(i);
                break;
            case R.id.after_eating: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_aeating.html");
                i.putExtra("heading","After eating");
                startActivity(i);
                break;
            case R.id.holy_queen: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_w_conclusion.html");
                i.putExtra("heading","Concluding prayer");
                startActivity(i);
                break;

            case R.id.hailmary: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_holyqueen.html");
                i.putExtra("heading","Hail holy queen");
                startActivity(i);
                break;
            case R.id.memorare: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","e_p_memorare.html");
                i.putExtra("heading","Memorare");
                startActivity(i);
                break;
                default:break;
        }

    }
}

