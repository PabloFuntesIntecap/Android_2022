package com.pfuentes.Miapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* operacion logica es un componente que va ir cambiando*/
    //declaracion de variables globales que representaran a los elementos o views.

    private TextView textviewContador;
    private int contador = 0; //se puede usar en todos los metodos creados


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //aqui se crean los botones que van a tener alguna accion
        textviewContador = findViewById(R.id.Contador);

    }
// se crean metodos

    private void mas(){

        contador++;
        this.textviewContador.setText(String.valueOf(contador));
    }

    private void menos(){

        contador--;
        this.textviewContador.setText(String.valueOf(contador));
    }
// aqui terminan los metodos que se utilizaran

    public void onClick(View view) {
        /* es como un actionPerformace variables de clase , variables globales*/

    //se va a llamar el parametro
        if(view.getId()==R.id.btmas){
            this.mas();

        }
        if(view.getId()==R.id.btmenos){
            this.menos();
        }

    }
}