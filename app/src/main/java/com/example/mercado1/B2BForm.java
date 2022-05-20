package com.example.mercado1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class B2BForm extends AppCompatActivity {
Button b1;
 ImageButton b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2_bform);
        b1=(Button) findViewById(R.id.btnSend);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getBaseContext(),A2.class);
                i.putExtra("Code",123);
                startActivity(i);
            }
        });

        b2= (ImageButton) findViewById(R.id.btnMenu);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(getBaseContext(),A8.class);
                startActivity(i2);
            }
        });

        b3=(ImageButton) findViewById(R.id.btnBasket);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getBaseContext(),A4.class);
                startActivity(i);
            }
        });

    }
}