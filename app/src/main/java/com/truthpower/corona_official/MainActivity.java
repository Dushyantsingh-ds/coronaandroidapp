package com.truthpower.corona_official;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButton01,mButton02,mButton03,mButton04,mButton05,mButton06;
    String[] urls=new String[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        mButton01=findViewById(R.id.button5);

        mButton02=findViewById(R.id.button6);
        mButton03=findViewById(R.id.button7);
        mButton04=findViewById(R.id.button3);
        mButton05=findViewById(R.id.button8);
        mButton06=findViewById(R.id.buttonre);


         urls[0]="file:////android_asset/Q&A on coronaviruses (COVID-19).html";
        urls[1]="https://www.mohfw.gov.in/";
        urls[2]="https://google.com/covid19-map/";
        urls[3]="https://www.indiatoday.in/";
        urls[4]="https://www.who.int/emergencies/diseases/novel-coronavirus-2019/global-research-on-novel-coronavirus-2019-ncov";

        mButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });
        mButton06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[4]);
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
        mButton03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[2]);
                startActivity(intent);
            }
        });
        mButton04.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/search/hospital+near+me/@28.724644,77.6929455,13z/data=!3m1!4b1"));
                startActivity(intent);

            }

        });
        mButton05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[3]);
                startActivity(intent);
            }
        });
    }


    public void call2(View view) {
        startActivity(new Intent(MainActivity.this, checkyouself.class));
    }

    public void all_about(View view) {
        startActivity(new Intent(MainActivity.this, all_about_corona.class));
    }

    public void helplineno(View view) {
        startActivity(new Intent(MainActivity.this, helplinenos.class));
    }

    public void buy_mask_senitizor(View view) {
        startActivity(new Intent(MainActivity.this, buy_mask.class));
    }

    public void protect(View view) {
        startActivity(new Intent(MainActivity.this, protect_yourself.class));
    }
}
