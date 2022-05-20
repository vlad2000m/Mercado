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

public class A7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a7);

    }


    public void submit(View v)
    {
        Context context = getApplicationContext();
        String text = "Order Completed ";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent iv = new Intent(this, A2.class);
        startActivity(iv);
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