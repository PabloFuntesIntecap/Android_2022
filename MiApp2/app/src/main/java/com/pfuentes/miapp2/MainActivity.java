package com.pfuentes.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private TextView textViewResultado;
    private EditText editTextEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.edtnombre);
        textViewResultado = findViewById(R.id.txtResultado);
        editTextEdad = findViewById(R.id.edtedad);
    }

    /*crear los metodos */

    private void mostrar(){

     String nombre = editTextNombre.getText().toString(); /*para que sea un texto */
     String edad = editTextEdad.getText().toString();


     /*excepciones */
     if(!nombre.isEmpty() && !edad.isEmpty()){
        Calendar c = Calendar.getInstance();
        int anacimiento = c.get(Calendar.YEAR)- Integer.parseInt(edad);


    textViewResultado.setText("Su nombre es: "+nombre+". Su año de nacimiento fue: "+anacimiento);

     }

else {

         Toast.makeText(this, "Dato No ingresado", Toast.LENGTH_SHORT).show();

     }

    }



    public void onClick(View view) {

switch (view.getId()){

    case R.id.btnMostrar:
        mostrar();
        break;
}

    }
}