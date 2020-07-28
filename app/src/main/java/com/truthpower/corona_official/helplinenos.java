package com.truthpower.corona_official;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class helplinenos extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helplinenos);
        getSupportActionBar().hide();
        pdfView=findViewById(R.id.pdfv);
        pdfView.fromAsset("coronvavirushelplinenumber.pdf").load();
    }
}
