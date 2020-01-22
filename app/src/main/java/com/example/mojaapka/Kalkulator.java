package com.example.mojaapka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    int a,b;
    float obliczenie;
    float WynikDodawania, WynikOdejmowania;
    TextView wynik;
    Button dodaj, odejmij, razy, podziel;
    EditText liczbapierwsza, liczbadruga;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        wynik = (TextView)findViewById(R.id.Pole);
        liczbapierwsza=(EditText)findViewById(R.id.PierwszaLiczba);
        liczbadruga=(EditText)findViewById(R.id.DrugaLiczba);

        dodaj=(Button)findViewById((R.id.Dodaj)) ;
        odejmij=(Button)findViewById((R.id.Odejmij)) ;
        razy=(Button)findViewById((R.id.Pomnoż)) ;
        podziel=(Button)findViewById((R.id.Podziel)) ;

        dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(liczbapierwsza.getText().toString());
                b = Integer.parseInt(liczbadruga.getText().toString());
                obliczenie= a+b;
                wynik.setText(String.valueOf(obliczenie));

            }
        });

        odejmij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(liczbapierwsza.getText().toString());
                b=Integer.parseInt((liczbadruga.getText().toString()));
                obliczenie= a - b;
                wynik.setText(String.valueOf(obliczenie));
            }
        });

        razy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(liczbapierwsza.getText().toString());
                b=Integer.parseInt((liczbadruga.getText().toString()));
                obliczenie= a * b;
                wynik.setText(String.valueOf(obliczenie));
            }
        });

        podziel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(liczbapierwsza.getText().toString());
                b=Integer.parseInt((liczbadruga.getText().toString()));
                obliczenie= a / b;
                wynik.setText(String.valueOf(obliczenie));
            }
        });





        }
    }

