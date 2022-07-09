package com.pfuentes.myapppoemasgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

    /*PARA LLAMAR A LAS ACTIVITIS */
    Intent int_nacion = new Intent(this,Act_nacion.class);
    Intent int_roman = new Intent(this,Act_romaticos.class);
    Intent int_super = new Intent(this,Act_superacion.class);

    /*BOTONES DE LLAMADAS */
    switch (view.getId()){

        case R.id.btn_romaticos:
            startActivity(int_roman);
        break;

        case R.id.btn_superacion:
            startActivity(int_super);
        break;

        case R.id.btn_nacion:
            startActivity(int_nacion);
        break;
    }
    }
}