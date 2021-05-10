package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] frases;
   TextView txtHolaMundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHolaMundo = findViewById(R.id.txtHolaMundo);

        frases = new String[5];
        frases[0] = "Te va salir un proyecto muy chulo";
        frases[1] = "El dominfgo cuando valla de excursion no va llover";
        frases[2] = "Barcelona sale campeon";
        frases[3] = "Compra la galletita de la suerte";
        frases[4] = "Busca lo mas vital no mas.";


    }

    public void generarSaludar(View view) {


        int num = (int)(Math.random()*5);
        txtHolaMundo.setText("Hoy toka "+frases[num]);
    }
}