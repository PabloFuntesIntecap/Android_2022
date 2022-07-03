package com.pfuentes.myappactividad01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class menor_edad extends AppCompatActivity {
    /*creando los objetos para ingresar info y tambien el boton*/

    private EditText edt_respuesta;
    private TextView txt_resultado, txt_operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menor_edad);

/*ASIGNANDO LAS VARIABLES A LOS OBJETOS QUE SE CREARON PARA PODER INTERACTURAR*/

    edt_respuesta = findViewById(R.id.edt_respuesta);
    txt_operacion = findViewById(R.id.txt_operacion);
    txt_resultado = findViewById(R.id.txt_resultado);

    procesoOpecion();

    }

    public int result = 0;

    public void procesoOpecion(){
        String operacion = "";

        /* asignando los dos valores aleatoreos*/
        Random r = new Random();
        int valor1 = r.nextInt(10-0)+0;
        int valor2 = r.nextInt(10-0)+0;

        operacion = valor1 + " + " + valor2 +" = ";

        this.result = valor1+valor2;

        txt_operacion.setText(operacion);


        }

/* VALIDACION DEL RESULTADO CON LO INGRESADO */

    private void validacionResultado(){

       String res_user = edt_respuesta.getText().toString();

    if(!res_user.isEmpty()){

            if(this.result==Integer.parseInt(res_user)){

                txt_resultado.setText("Es correcto ya no eres un bebé.");

                } else {
                        txt_resultado.setText("Es incorrecto, aún sigues siendo un bebé.");
                       }


    }   else {

        Toast.makeText(this, "INGRESE EL RESULTADO DE LA SUMA", Toast.LENGTH_SHORT).show();
    }


    }


    public void onClick(View view) {

    switch (view.getId())   {

        case R.id.btn_atras:
            this.finish();
            break;

        case R.id.btn_validar:
            this.validacionResultado();
            break;

        case R.id.btn_cerrar:
            Intent intent = new Intent(this, cerrar.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

    }

    }
}