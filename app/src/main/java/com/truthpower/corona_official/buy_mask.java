package com.truthpower.corona_official;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buy_mask extends AppCompatActivity {
    Button mButton01,mButton02;
    String[] urls=new String[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_mask);

        mButton01=findViewById(R.id.button1);

        mButton02=findViewById(R.id.button2);

        urls[0]="https://amzn.to/3arP7QG";
        urls[1]="https://amzn.to/2Jj67fU";
        mButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });
        mButton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[1]);
                startActivity(intent);
            }
        });
    }
}
