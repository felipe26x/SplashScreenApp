package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class Sproducto extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

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

    public void onClick(View view) {
    }


    public void dispatchTakePictureIntent(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    public void volver(View view) {
        Intent intent= new Intent(Sproducto.this,MainActivity.class);
        startActivity(intent);
    }
}