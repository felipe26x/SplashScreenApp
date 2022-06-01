package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sproducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sproducto);
    }

    public void home(View view) {

        Intent intent= new Intent(Sproducto.this,MainActivity.class);
        startActivity(intent);
    }


    public void perfil(View v){
        Intent intent = new Intent(Sproducto.this, perfil1.class);
        startActivity(intent);

    }

    public void fav(View view) {

        Intent intent= new Intent(Sproducto.this,Favoritos.class);
        startActivity(intent);
    }

    public void subir(View view) {
    }
}