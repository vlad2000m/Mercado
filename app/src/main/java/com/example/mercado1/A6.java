package com.example.mercado1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class A6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a6);


    }
    public void infos(View v)
    {
        Intent i1 = new Intent(this, A7.class);
        startActivity(i1);
    }
    public void basket(View v)
    {
        Intent i1 = new Intent(this, A4.class);
        startActivity(i1);
    }
    public void aboutUs(View v)
    {
        Intent i1 = new Intent(this, A8.class);
        startActivity(i1);
    }
}