package com.example.letuspray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button startbtn=(Button) findViewById(R.id.feedback);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }
    protected void sendEmail(){
        Intent intent=new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","manumathew393@gmail.com", null));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Let's pray feedback");
        startActivity(Intent.createChooser(intent,"choose"));
    }
}
