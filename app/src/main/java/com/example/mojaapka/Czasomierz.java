package com.example.mojaapka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Czasomierz extends AppCompatActivity {

    Chronometer stoper;
    private boolean czyDziala;
    Button start, pauza, odnowa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_czasomierz);

        stoper=(Chronometer)findViewById(R.id.stoper);
        start=(Button)findViewById(R.id.Start);
        pauza=(Button)findViewById(R.id.Pauza);
        odnowa=(Button)findViewById(R.id.Odnowa);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stoper.start();
            }
        });

        odnowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stoper.setBase(SystemClock.elapsedRealtime());
            }
        });

        pauza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(czyDziala=true) stoper.stop();
            }
        });


        }


    }

