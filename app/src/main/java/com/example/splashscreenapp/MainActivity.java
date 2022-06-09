package com.example.splashscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ver = (Button) findViewById(R.id.button);


        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, descripcionproducto.class);
                startActivity(intent);
            }
        });


    }

    public void fav(View view) {

        Intent intent= new Intent(MainActivity.this,Favoritos.class);
        startActivity(intent);
    }

    public void subir(View view) {
        Intent intent= new Intent(MainActivity.this,Sproducto.class);
        startActivity(intent);
    }

    public void perfil(View v){
        Intent intent = new Intent(MainActivity. this, perfil1.class);
        startActivity(intent);

    }
}




