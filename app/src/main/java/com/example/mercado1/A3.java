package com.example.mercado1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class A3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);

    }



    public void plus(View v)
    {
        Context context = getApplicationContext();
        String text = "Item added to basket   ";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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