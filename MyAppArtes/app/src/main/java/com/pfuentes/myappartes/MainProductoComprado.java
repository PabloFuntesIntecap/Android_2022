package com.pfuentes.myappartes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainProductoComprado extends AppCompatActivity {

    private TextView textView_titulo, textView_material, textView_precio;
    private EditText editText_nombre, editText_apellido, editText_nit;
    private Button button_aceptar, button_cancelar;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_producto_comprado);

        /*IDENTIFICANDO LOS OBJETOS A ACTUALIZAR */

        textView_titulo = findViewById(R.id.titulo_comprado);
        textView_material = findViewById(R.id.material_comprado);
        textView_precio = findViewById(R.id.precio_comprado);
        editText_nombre = findViewById(R.id.edtNombre_comprado);
        editText_apellido = findViewById(R.id.edtApellido_comprado);
        editText_nit = findViewById(R.id.edtNit_comprado);
        imageView = findViewById(R.id.img_comprado);
        button_aceptar = findViewById(R.id.btn_comprar);
        button_cancelar = findViewById(R.id.btn_cancelar);

        actualizacion();
        this.onClick();

    }

    /*ACTUALIZACION DE INFORMACION */

    private void actualizacion() {

        Bundle bundle = getIntent().getExtras();
        String titulo = bundle.getString("titulo");
        String material = bundle.getString("material");
        String precio = bundle.getString("precio");
        int imagen = bundle.getInt("imagen");

        //*******setear ********************//

        textView_titulo.setText(String.valueOf(titulo));
        textView_material.setText(String.valueOf(material));
        textView_precio.setText(String.valueOf(precio));
        imageView.setImageResource(imagen);


    }

    private void onClick() {
        button_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AQUI TAMPOCO FUNCION UN DESTROY CIERRA LA APLICACION CON ERROR//
                datosIngresados();
                //NO FUNCIONA AQUI UN DESTROY CIERRA LA APLICACION CON ERROR //

            }
        });

        button_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            finish();

            }
        });
        {


        }
    }

    private void datosIngresados() {
        String nombre = editText_nombre.getText().toString();
        String apellido = editText_apellido.getText().toString();
        String nit = editText_nit.getText().toString();
        if (!nombre.isEmpty() && !apellido.isEmpty() && !nit.isEmpty()) {

            Bundle bundle = getIntent().getExtras();
            String precio = bundle.getString("precio");
            int imagen = bundle.getInt("imagen");

            trasladofinal(imagen, precio, nombre, apellido, nit);

        } else {

            Toast.makeText(this, "Revise los datos pues hay alguno faltante", Toast.LENGTH_SHORT).show();
        }

    }

    private void trasladofinal(int imagen, String precio, String nombre, String apellido, String nit) {

        Intent intent = new Intent(this, MainFinalizar.class);
        intent.putExtra("imagen", imagen);
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellido", apellido);
        intent.putExtra("nit", nit);
        intent.putExtra("precio", precio);
        startActivity(intent);
        finish(); //para finalizar la 3er activity y no retornar a ésta actividad //
    }

}