package com.example.mojaapka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OtworzKalkulator(View view) {
        Intent intent = new Intent(this, Kalkulator.class);
        startActivity(intent);
    }

    public void OtworzStoper(View view) {
        Intent intent = new Intent(this, Czasomierz.class);
        startActivity(intent);
    }
}
