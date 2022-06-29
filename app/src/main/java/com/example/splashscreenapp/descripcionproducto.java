package com.example.splashscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class descripcionproducto extends AppCompatActivity {


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcionproducto);


    }


    public void volver(View view) {
        Intent intent= new Intent(descripcionproducto.this,MainActivity.class);
        startActivity(intent);
    }
}