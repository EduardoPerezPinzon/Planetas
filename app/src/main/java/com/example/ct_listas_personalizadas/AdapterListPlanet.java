package com.example.ct_listas_personalizadas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterListPlanet extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombres;
    private final String[] orden;
    private final String[] descripcion;
    private final Integer[] id_images;


    public AdapterListPlanet(Activity context, String[] nombres, String[] orden, String[] descripcion, Integer[] id_images) {
        super(context, R.layout.item, nombres);
        this.context = context;
        this.nombres = nombres;
        this.descripcion = descripcion;
        this.orden = orden;
        this.id_images = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item, null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.nombre);
        TextView _orden = (TextView) itemView.findViewById(R.id.orden);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo);
        _nombre.setText(nombres[position]);
        _orden.setText(orden[position]);
        _imagen.setImageResource(id_images[position]);
        return itemView;
    }
}
