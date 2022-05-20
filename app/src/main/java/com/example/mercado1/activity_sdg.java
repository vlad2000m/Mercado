package com.example.mercado1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_sdg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdg);



    }

    public void basket(View view) {
        Intent i1 = new Intent(this, A4.class);
        startActivity(i1);
    }

    public void aboutUs(View view) {
        Intent i1 = new Intent(this, A8.class);
        startActivity(i1);
    }
}