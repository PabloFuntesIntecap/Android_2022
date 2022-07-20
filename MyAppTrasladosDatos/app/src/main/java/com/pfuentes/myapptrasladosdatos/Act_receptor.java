package com.pfuentes.myapptrasladosdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Act_receptor extends AppCompatActivity {

/* OBJETOS O ELEMENTOS A UTILIZAR */

    /*OBJETOS A UTILIZAR */

    private TextView texViewN, texViewA, texViewE, texViewD, texViewT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_receptor);

    /*ASOCIANDO OBJETO CON VARIABLES */
     texViewN = findViewById(R.id.txt_nombre);
     texViewA = findViewById(R.id.txt_apellido);
     texViewE = findViewById(R.id.txt_edad);
     texViewD = findViewById(R.id.txt_direccion);
     texViewT = findViewById(R.id.txt_telefono);

     /* METODOS QUE SE EJECUTARAN AUTOMATICAMENTE */

     obtenerDatosTrasladados();

    }
    private void obtenerDatosTrasladados(){

        // se agrega el objeto Bundle para obtener de forma optima los datos trasladados por
        // medio del intent

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){

        String nombre = bundle.getString("nom");
        String apellido = bundle.getString("ape");
        String edad = bundle.getString("eda");
        String direccion = bundle.getString("dir");
        String telefono = bundle.getString("tel");

        texViewN.setText("Nombre: "+nombre);
        texViewA.setText("Apellido: "+apellido);
        texViewE.setText("Edad: "+edad);
        texViewD.setText("Dirección: "+direccion);
        texViewT.setText("Telefono: "+telefono);


        } else {
            Toast.makeText(this, "Datos no encontrados", Toast.LENGTH_SHORT).show();
        }

    }
}