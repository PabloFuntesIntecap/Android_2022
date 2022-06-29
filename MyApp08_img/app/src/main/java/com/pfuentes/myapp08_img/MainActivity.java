package com.pfuentes.myapp08_img;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*****creando un button *****/

   private Button button, button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnTipo);
        button2= findViewById(R.id.btnTamanio);

/* puede ESTAR EL CLICK AQUI ADENTRO YA NO SE USARA EL THIS*/
        this.click();
    }

    private void click(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Soy un Camión de carga", Toast.LENGTH_SHORT).show();
            /* AQUI PUEDE AGREGARSE CUALQUIER TIPO DE PROCESO O LLAMAR OTRO PROCESO COMO EL CLICK*/
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Soy un camionote gigante!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }


}

