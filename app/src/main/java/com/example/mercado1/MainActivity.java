package com.example.mercado1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = (ImageButton) findViewById(R.id.i1);
        setContentView(R.layout.activity_main);

    }


            public void startt(View v)
            {
                Intent i = new Intent(this, A2.class);
                startActivity(i);
            }


    public void gotologin(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }
}
