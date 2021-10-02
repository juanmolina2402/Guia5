package com.labmoviles.guia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void conversations(View view){
        startActivity(new Intent(MainActivity.this, ConversationsActivity.class));
    }

    public void login(View view){
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void calculadora(View view){
        startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
    }

    public void verDatos(View view){
        startActivity(new Intent(MainActivity.this, DatosActivity.class));
    }
}