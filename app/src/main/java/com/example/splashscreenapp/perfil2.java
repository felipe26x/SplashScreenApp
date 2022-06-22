package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfil2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil2);
    }

    public void onClick(View view) {

        Intent intent= new Intent(perfil2.this,admin.class);
        startActivity(intent);

    }

    public void admin(View view) {
        Intent intent= new Intent(perfil2.this,admin.class);
        startActivity(intent);
    }
}