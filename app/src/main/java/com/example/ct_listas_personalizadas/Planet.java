package com.example.ct_listas_personalizadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Planet extends AppCompatActivity {
    private TextView planetName;
    private TextView planetDesc;
    private ImageView planetImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);

        planetName = (TextView) findViewById(R.id.planetName);
        planetDesc = (TextView) findViewById(R.id.planetDesc);
        planetImage = (ImageView) findViewById(R.id.planetImage);

        String description = getIntent().getStringExtra("DESC");
        String name = getIntent().getStringExtra("NAME");

        planetName.setText(name);
        planetDesc.setText(description);
    }
}