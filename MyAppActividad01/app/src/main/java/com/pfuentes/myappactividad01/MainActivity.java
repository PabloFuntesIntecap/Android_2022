package com.pfuentes.myappactividad01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*creando los objetos para ingresar info y tambien el boton*/
    private EditText editTextNombre, editTextEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ASIGNANDO LAS VARIABLES A LOS OBJETOS QUE SE CREARON PARA PODER INTERACTURAR*/
    editTextNombre = findViewById(R.id.edt_nombre);
    editTextEdad = findViewById(R.id.edt_edad);



    }
/* validar datos*/

private void validacion(){

    String nombre = editTextNombre.getText().toString();
    String edad = editTextEdad.getText().toString();

    if(!nombre.isEmpty() && !edad.isEmpty()){

        /* valores de la edad */

            if (Integer.parseInt(edad)<0 || Integer.parseInt(edad)>123){

                Toast.makeText(this, "EDAD ERRONEA O INEXISTENTE", Toast.LENGTH_SHORT).show();
            } else {

                    if(Integer.parseInt(edad)<18 ){
                        
                        this.menor();

                    } else {

                        this.mayor();
                    }

            }


    } else {

        Toast.makeText(this, "Falta algún dato por ingresar", Toast.LENGTH_SHORT).show();

    }



    }

private void mayor(){

    Intent intent = new Intent (this,mayor_edad.class);
    startActivity(intent);

}

    private void menor(){

        Intent intent = new Intent (this,menor_edad.class);
        startActivity(intent);

    }

    public void onClick(View view) {

    switch (view.getId()){

        case R.id.btn_validar:
            this.validacion();
            break;

    }

    }
}