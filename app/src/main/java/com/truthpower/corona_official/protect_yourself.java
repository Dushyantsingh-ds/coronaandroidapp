package com.truthpower.corona_official;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class protect_yourself extends AppCompatActivity {
    PDFView pdfView;
    Button mButton01,mButton02,mButton03,mButton04,mButton05,mButton06,mButton07,mButton0;
    String[] urls=new String[8];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protect_yourself);
        getSupportActionBar().hide();
        pdfView=findViewById(R.id.pdfv);
        pdfView.fromAsset("when and how to use mask.pdf").load();
        mButton01=findViewById(R.id.button1);

        mButton02=findViewById(R.id.button2);
        mButton03=findViewById(R.id.button3);
        mButton04=findViewById(R.id.button4);

        mButton05=findViewById(R.id.button5);
        mButton06=findViewById(R.id.button6);
        mButton07=findViewById(R.id.button7);
        mButton0=findViewById(R.id.button0);

        urls[0]="https://www.youtube.com/watch?v=M4olt47pr_o&list=PL9S6xGsoqIBU2V6AZYGlJwZRAFJ3YDreb&index=13";

        mButton0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);

            }

        });

        mButton01.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                pdfView=findViewById(R.id.pdfv);
                pdfView.fromAsset("ask who.pdf").load();

            }

        });
        mButton02.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                pdfView=findViewById(R.id.pdfv);
                pdfView.fromAsset("be ready for corona virus.pdf").load();

            }

        });
        mButton03.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                pdfView=findViewById(R.id.pdfv);
                pdfView.fromAsset("how to cope with stress during 2019 covid ourbreak.pdf").load();

            }

        });
        mButton04.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                pdfView=findViewById(R.id.pdfv);
                pdfView.fromAsset("parenting in the time of covid 19.pdf").load();

            }

        });
        mButton05.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                pdfView=findViewById(R.id.pdfv);
                pdfView.fromAsset("protect yourself and others from getting sick.pdf").load();

            }

        });
        mButton06.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                pdfView=findViewById(R.id.pdfv);
                pdfView.fromAsset("stay healthy while travelling .pdf").load();

            }

        });
        mButton07.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                pdfView=findViewById(R.id.pdfv);
                pdfView.fromAsset("when and how to use mask.pdf").load();

            }

        });
    }
}
