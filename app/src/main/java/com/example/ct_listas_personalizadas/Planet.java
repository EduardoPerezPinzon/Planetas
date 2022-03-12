package com.example.ct_listas_personalizadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Planet extends AppCompatActivity {
    private TextView planet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);
        planet = (TextView) findViewById(R.id.planet);
        String id = getIntent().getStringExtra("id");
        planet.setText(id);
    }
}