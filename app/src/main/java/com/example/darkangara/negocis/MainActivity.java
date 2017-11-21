package com.example.darkangara.negocis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public ImageView restaurants, weather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restaurants = (ImageView) findViewById(R.id.buttonR);
        restaurants.setOnClickListener(this);
        weather = (ImageView) findViewById(R.id.buttonW);
        weather.setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.buttonR: startActivity(new Intent(this,restaurant.class));
                break;
            case R.id.buttonW: startActivity(new Intent(this,weather.class));
                break;
        }
    }

    public void hotels(View v)
    {
        startActivity(new Intent(this, hotels.class));
    }

    public void movies(View v)
    {
        startActivity(new Intent(this, movies.class));
    }
}
