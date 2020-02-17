package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void zadanie1(View view) {
        Intent startZadanie1=new Intent(this, Zadanie_1.class);
        startActivity(startZadanie1);
    }

    public void zadanie2(View view) {
        Intent startZadanie2=new Intent(this, Zadanie_2.class);
        startActivity(startZadanie2);
    }
}
