package com.example.splashscreenapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideojuegosAdapter extends RecyclerView.Adapter<VideojuegosAdapter.ComidaViewHolder> {

    private List<Videojuegos> items;
    private LayoutInflater mInflate;
    private Context context;



    @NonNull
    @Override
    public VideojuegosAdapter.ComidaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);
        return new ComidaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VideojuegosAdapter.ComidaViewHolder holder, int i) {
        holder.imagen.setImageResource(items.get(i).getImagen());
        holder.nombre.setText(items.get(i).getNombre());
        holder.visitas.setText("Visitas"+String.valueOf(items.get(i).getVisitas()));
    }

    @Override
    public int getItemCount()  {
        return items.size();
    }


    public class ComidaViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView visitas;

        public ComidaViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            visitas = (TextView) itemView.findViewById(R.id.visitas);
        }
    }

    public void setItems(List<Videojuegos>items){items = items;}

    public VideojuegosAdapter(List<Videojuegos> items) {
        this.items = items;

    }

}
