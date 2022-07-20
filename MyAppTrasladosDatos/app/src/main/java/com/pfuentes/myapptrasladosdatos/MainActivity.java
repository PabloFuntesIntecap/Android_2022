package com.pfuentes.myapptrasladosdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*OBJETOS A UTILIZAR */

    private EditText editTextN, editTextA, editTextE, editTextD, editTextT;
    private Button buttonTD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*VARIABLES A UTILIZAR */
        editTextN = findViewById(R.id.edt_nombre);
        editTextA = findViewById(R.id.edt_apellido);
        editTextE = findViewById(R.id.edt_edad);
        editTextD = findViewById(R.id.edt_direccion);
        editTextT = findViewById(R.id.edt_telefono);

        buttonTD = findViewById(R.id.btn_accion);
        this.click();
    }

    private void click(){
        buttonTD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*LLAMANDO EL PROCCESO */
                datosATrasladar();
            }
        });

    }

   private void datosATrasladar(){

        String nombre = editTextN.getText().toString();
       String apellido = editTextA.getText().toString();
       String edad = editTextE.getText().toString();
       String direccion = editTextD.getText().toString();
       String telefono = editTextT.getText().toString();

       if(!nombre.isEmpty() &&!apellido.isEmpty() &&
          !edad.isEmpty() && !direccion.isEmpty() &&
          !telefono.isEmpty()){

           Intent intent = new Intent(this, Act_receptor.class);
           intent.putExtra("nom",nombre);
           intent.putExtra("ape",apellido);
           intent.putExtra("eda",edad);
           intent.putExtra("dir",direccion);
           intent.putExtra("tel",telefono);
           /* SIEMPRE DEBE DE IR UN START PARA ENVIAR LOS DATOS */
           startActivity(intent);

       } else{
           Toast.makeText(this, "Revise los datos pues hay alguno faltante", Toast.LENGTH_SHORT).show();
       }

   }

}