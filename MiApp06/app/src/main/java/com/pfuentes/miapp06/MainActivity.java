package com.pfuentes.miapp06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*CREANDO LOS OBJETOS QUE TENDRAN DINAMISMO EN NUESTRO PROYECTO*/

    private TextView txtViewResultado1, txtViewResultado2;
    private EditText editTextNum1, editTextNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ASIGNANDO LAS VARIABLES A LOS OBJETOS QUE SE CREARON PARA PODER INTERACTURAR*/

        editTextNum1 = findViewById(R.id.edtnum1);
        editTextNum2 = findViewById(R.id.edtnum2);
        txtViewResultado1 = findViewById(R.id.txtResultado1);
        txtViewResultado2 = findViewById(R.id.txtResultado2);


    }


    /* OPERACIONES */

    private void suma(){

        /* VARIABLES PARA TODAS LAS OPERACIONES */
        String num1 = editTextNum1.getText().toString();
        String num2 = editTextNum2.getText().toString();

        if(!num1.isEmpty() && !num2.isEmpty()){
            Double resultado = Double.parseDouble(num1) + Double.parseDouble(num2) ;
            txtViewResultado1.setText("La suma es: " + String.valueOf(resultado));
            txtViewResultado2.setText("...");
        } else {

            Toast.makeText(this, "Ingrese Numero Faltantes", Toast.LENGTH_SHORT).show();

        }

    }
    private void resta(){

        /* VARIABLES PARA TODAS LAS OPERACIONES */
        String num1 = editTextNum1.getText().toString();
        String num2 = editTextNum2.getText().toString();

        if(!num1.isEmpty() && !num2.isEmpty()){
            Double resultado = Double.parseDouble(num1) - Double.parseDouble(num2) ;
            txtViewResultado1.setText("La resta es: " + String.valueOf(resultado));
            txtViewResultado2.setText("...");
        } else {

            Toast.makeText(this, "Ingrese Numero Faltantes", Toast.LENGTH_SHORT).show();

        }

    }

    private void multi(){

        /* VARIABLES PARA TODAS LAS OPERACIONES */
        String num1 = editTextNum1.getText().toString();
        String num2 = editTextNum2.getText().toString();

        if(!num1.isEmpty() && !num2.isEmpty()){
            Double resultado = Double.parseDouble(num1) * Double.parseDouble(num2) ;
            txtViewResultado1.setText("La Multiplicación es: " + String.valueOf(resultado));
            txtViewResultado2.setText("...");
        } else {

            Toast.makeText(this, "Ingrese Numero Faltantes", Toast.LENGTH_SHORT).show();

        }

    }

    private void divi(){

        /* VARIABLES PARA TODAS LAS OPERACIONES */
        String num1 = editTextNum1.getText().toString();
        String num2 = editTextNum2.getText().toString();

        if(!num1.isEmpty() && !num2.isEmpty()){
            Double resultado = Double.parseDouble(num1) / Double.parseDouble(num2) ;
            txtViewResultado1.setText("La división es: " + String.valueOf(resultado));
            txtViewResultado2.setText("...");
        } else {

            Toast.makeText(this, "Ingrese Numero Faltantes", Toast.LENGTH_SHORT).show();

        }

    }

    private void mayor(){

        /* VARIABLES PARA TODAS LAS OPERACIONES */
        String num1 = editTextNum1.getText().toString();
        String num2 = editTextNum2.getText().toString();

        if(!num1.isEmpty() && !num2.isEmpty()){

            if(Double.parseDouble(num1) > Double.parseDouble(num2)){

                txtViewResultado2.setText(num1.toString());
            } else {txtViewResultado2.setText(num2.toString()); }


        } else {

            Toast.makeText(this, "Ingrese Numero Faltantes", Toast.LENGTH_SHORT).show();

        }



    }
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.brnMas:
                suma();
                break;

            case R.id.brnMenos:
                resta();
                break;

            case R.id.brnMulti:
                multi();
                break;

            case R.id.brnDivi:
                divi();
                break;

            case R.id.brnMayor:
                mayor();
                break;
        }
    }
}