package com.example.mercado1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class A8 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a8);
    }

        public void about(View v)
        {
            Intent i1 = new Intent(this, AboutUs.class);
            startActivity(i1);
        }
        public void meet(View v)
        {
            Intent i2 = new Intent(this, MeetF.class);
            startActivity(i2);
        }
        public void food(View v)
        {
            Intent i3 = new Intent(this, FoodS.class);
            startActivity(i3);
        }
        public void b2b(View v)
        {
            Intent i4 = new Intent(this, B2B.class);
            startActivity(i4);
        }
    public void home(View v)
    {
        Intent i4 = new Intent(this, A2.class);
        startActivity(i4);
    }

    public void basket(View v)
    {
        Intent i1 = new Intent(this, A4.class);
        startActivity(i1);
    }


}