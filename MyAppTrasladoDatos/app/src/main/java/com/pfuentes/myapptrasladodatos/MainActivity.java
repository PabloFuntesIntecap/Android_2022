package com.pfuentes.myapptrasladodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*OBJETOS A UTILIZAR */

    private TextView textView1;
    private EditText editTexYear;
    private Button buttonValidar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*VARIABLE A UTILIZAR */

        buttonValidar = findViewById(R.id.btn_validar);
        editTexYear = findViewById(R.id.edt_year);

    this.click();

    }

    private void click(){
        buttonValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos_traslados();
            }
        });

    }

    private void datos_traslados(){
    String year = editTexYear.getText().toString();

    /* VALIDACION */

        if( !year.isEmpty()){

            if (Integer.parseInt(year)>0 && Integer.parseInt(year)<3000 ){

                Intent intent =new Intent(this, Act_resultado.class);
                intent.putExtra("year",year);
                startActivity(intent);

            } else {
                Toast.makeText(this, "VALOR INGRESADO NO PERMITIDO", Toast.LENGTH_SHORT).show();
            }


        } else {
            Toast.makeText(this, "INGRESE UN AÑO VALIDO", Toast.LENGTH_SHORT).show();
        }


    }
}