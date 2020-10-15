package com.example.letuspray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.Calendar;

public class Malayalam_rosary extends AppCompatActivity implements View.OnClickListener {
    private CardView r1, r2, r3, r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malayalam_rosary);
        r1=(CardView) findViewById(R.id.english_prayer);
        r2=(CardView) findViewById(R.id.malayalm_prayer);
        r3=(CardView) findViewById(R.id.kannada_prayer);
        r4=(CardView) findViewById(R.id.hindi_prayer);


        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.english_prayer: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","m_r_intro.html");
                i.putExtra("heading","പ്രാരംഭ പ്രാർത്ഥന");
                startActivity(i);
                break;

            case R.id.malayalm_prayer: i=new Intent(this,Webview_prayer.class);
                Calendar calendar=Calendar.getInstance();
                int day=calendar.get(Calendar.DAY_OF_WEEK);
                switch (day){
                    case Calendar.SUNDAY:
                        i.putExtra("filename","m_r_m_glorious.html");
                        i.putExtra("heading","മഹത്വ രഹസ്യങ്ങള്‍ ");
                        startActivity(i);
                        break;

                    case Calendar.MONDAY:
                        i.putExtra("filename","m_r_m_joyfull.html");
                        i.putExtra("heading","സന്തോഷ രഹസ്യങ്ങൾ ");
                        startActivity(i);
                        break;
                    case Calendar.TUESDAY:
                        i.putExtra("filename","m_r_m_sorrowful.html");
                        i.putExtra("heading","ദു:ഖ രഹസ്യങ്ങൾ");
                        startActivity(i);
                        break;
                    case Calendar.WEDNESDAY:
                        i.putExtra("filename","m_r_m_glorious.html");
                        i.putExtra("heading","മഹത്വ രഹസ്യങ്ങള്‍ ");
                        startActivity(i);
                        break;
                    case Calendar.THURSDAY:
                        i.putExtra("filename","m_r_m_liminous.html");
                        i.putExtra("heading","പ്രകാശ രഹസ്യങ്ങൾ ");
                        startActivity(i);
                        break;
                    case Calendar.FRIDAY:
                        i.putExtra("filename","m_r_m_sorrowful.html");
                        i.putExtra("heading","ദു:ഖ രഹസ്യങ്ങൾ");
                        startActivity(i);
                        break;

                    case Calendar.SATURDAY:
                        i.putExtra("filename","m_r_m_joyfull.html");
                        i.putExtra("heading","സന്തോഷ രഹസ്യങ്ങൾ ");
                        startActivity(i);
                        break;


                    default:break;

                }

                break;
            case R.id.kannada_prayer: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","m_r_conclusion.html");
                i.putExtra("heading","ജപമാല സമർപ്പണം");
                startActivity(i);
                break;

            case R.id.hindi_prayer: i=new Intent(this,Webview_prayer.class);
                i.putExtra("filename","m_r_litany.html");
                i.putExtra("heading","ലുത്തിനിയ");
                startActivity(i);
                break;
            default:break;
        }

    }
}
