package com.pfuentes.myappartes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainFinalizar extends AppCompatActivity {
    private Button button_aceptaryfinalizar;
    private ImageView imageView;
    private TextView textView_titulofinal, textView_nit, textView_preciofinal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_finalizar);

        imageView = findViewById(R.id.imgfinal_comprado);
        textView_titulofinal = findViewById(R.id.txt_Titulofinal);
        textView_nit = findViewById(R.id.txt_nitfinal);
        textView_preciofinal=findViewById(R.id.txt_totalpago);
        button_aceptaryfinalizar = findViewById(R.id.btn_finalizaryregresar);

        actualizacionfinal();
        onClick();
    }

    private void actualizacionfinal(){

        Bundle bundle = getIntent().getExtras();
            String nombre = bundle.getString("nombre");
            String apellido = bundle.getString("apellido");
            String nit = bundle.getString("nit");
            String precio = bundle.getString("precio");
            int imagen = bundle.getInt("imagen");

          textView_titulofinal.setText("Muchas gracias por su compra: "+nombre+" "+apellido +"!!" );
          textView_nit.setText("NIT: "+nit);
          textView_preciofinal.setText(String.valueOf(precio));
          imageView.setImageResource(imagen);




    }

    private void onClick(){
        button_aceptaryfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                reiniciartodo();

            }
        });



    }

    private void reiniciartodo(){
        Intent intent = new Intent(this, MainActivity.class);
        // onDestroy(); aqui tambien proboca el cierre de la aplicacion //
        startActivity(intent);
        finish();//
    }
}