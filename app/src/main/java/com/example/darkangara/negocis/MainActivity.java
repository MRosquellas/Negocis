package com.example.darkangara.negocis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
