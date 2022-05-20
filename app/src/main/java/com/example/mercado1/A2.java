package com.example.mercado1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class A2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        Intent i=getIntent();
        int code=i.getIntExtra("Code",0);
        if(code==123){
            Toast.makeText(this, "Thank You\nOur representive will contact you shortly for a tailor made mercado solution", Toast.LENGTH_SHORT).show();

//            AlertDialog.Builder alert=new AlertDialog.Builder(this);
//            alert.setTitle("Thank You");
//            alert.setMessage("Our representive will contact you shortly for a tailor made mercado solution");
//            alert.create().show();
        }

    }




    public void fruits(View v)
    {
        Intent i1 = new Intent(this, A3.class);
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


    public void sdgs(View view) {
        Intent i1 = new Intent(this, activity_sdg.class);
        startActivity(i1);
    }
}