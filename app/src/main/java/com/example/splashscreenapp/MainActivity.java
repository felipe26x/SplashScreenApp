package com.example.splashscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class  MainActivity extends AppCompatActivity {
    Button ver;
    private TextView textView;
    private RelativeLayout relativeLayout;
    private RecyclerView recycler, recycler2;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager LManager;
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

        recycler = findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);




        List items = new ArrayList();

        items.add(new Videojuegos(R.drawable.papa, "Fifa 22", 20));
        items.add(new Videojuegos(R.drawable.platano, "gta 5", 12));
        items.add(new Videojuegos(R.drawable.cafe, "red dead demption", 32));
        items.add(new Videojuegos(R.drawable.s, "the last of us 2", 66));
        items.add(new Videojuegos(R.drawable.zana, "call of duty", 10));


        LManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recycler.setLayoutManager(LManager);

        adapter = new VideojuegosAdapter(items);
        recycler.setAdapter(adapter);
    }

    public void fav(View view) {

        Intent intent= new Intent(MainActivity.this,Favoritos.class);
        startActivity(intent);
    }

    public void subir(View view) {
        Intent intent= new Intent(MainActivity.this,Sproducto.class);
        startActivity(intent);
    }

    public void perfil3(View view){
        Intent intent = new Intent(MainActivity. this, perfil3.class);
        startActivity(intent);

    }





}




