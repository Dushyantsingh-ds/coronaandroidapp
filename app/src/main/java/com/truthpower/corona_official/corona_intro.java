package com.truthpower.corona_official;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class corona_intro extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_intro);
        getSupportActionBar().hide();
        pdfView=findViewById(R.id.pdfv);
        pdfView.fromAsset("corona_intro.pdf").load();
    }
}
