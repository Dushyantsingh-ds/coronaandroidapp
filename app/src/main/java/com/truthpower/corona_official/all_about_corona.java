package com.truthpower.corona_official;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class all_about_corona extends AppCompatActivity {
    Button mButton01;
    String[] urls=new String[1];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_about_corona);
        getSupportActionBar().hide();


        mButton01=findViewById(R.id.button2);
        urls[0]="https://www.youtube.com/watch?v=mOV1aBVYKGA";
        mButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });
    }

    public void coronaintro(View view) {
        startActivity(new Intent(all_about_corona.this, corona_intro.class));
    }
}
