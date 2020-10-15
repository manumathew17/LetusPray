package com.example.letuspray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Webview_prayer extends AppCompatActivity {
    WebView tv_text;
    TextView heading;
    String text="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_prayer);
        String fname, head_text;
        fname=getIntent().getStringExtra("filename");
        head_text=getIntent().getStringExtra("heading");
        tv_text=(WebView) findViewById(R.id.prayer_text1);
        heading=(TextView) findViewById(R.id.prayer_title);
        try {
            InputStream is= getAssets().open(fname);
            int size=is.available();
            byte[] buffer=new byte[size];
            is.read(buffer);

            text =new String(buffer);
            is.close();

        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        tv_text.loadDataWithBaseURL("",text,"text/html","UTF-8","");
        heading.setText(head_text);
    }
}
