package com.andresapp.miprimeraapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton m1, m2, m3, m4;

    Button comprar;
    private TextView moto1;
    private TextView moto2;
    private TextView moto3;
    private TextView moto4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moto1=findViewById(R.id.moto1);
        moto2=findViewById(R.id.moto2);
        moto3=findViewById(R.id.moto3);
        moto4=findViewById(R.id.moto4);
        comprar=findViewById(R.id.comprar);
    }

    }
