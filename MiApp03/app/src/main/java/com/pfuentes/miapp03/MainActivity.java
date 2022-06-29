package com.pfuentes.miapp03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*variables privadas */

    private EditText editTextNum1, editTextNum2;
    private TextView textViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    editTextNum1 = findViewById(R.id.edtNum1);
    editTextNum2 = findViewById(R.id.edtNum2);
    textViewResultado = findViewById(R.id.txt_Resultado);
    }

   private void suma(){

    String num1 = editTextNum1.getText().toString();
    String num2 = editTextNum2.getText().toString();

    if(!num1.isEmpty() && !num2.isEmpty()){

    int sumar = Integer.parseInt(num1) + Integer.parseInt(num2);
        textViewResultado.setText(String.valueOf(sumar));
    } else {

        Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_SHORT).show();


    }

   }



    public void onClick(View view) {
    switch (view.getId()){

        case R.id.btnResultado:

            suma();
            break;
    }


    }
}