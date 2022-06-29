package com.pfuentes.miapp04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

/*CREANDO LOS OBJETOS QUE TENDRAN DINAMISMO EN NUESTRO PROYECTO*/

    private TextView txtViewResultado;
    private EditText editTextProducto, editTextValor, editTextCantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*ASIGNANDO LAS VARIABLES A LOS OBJETOS QUE SE CREARON PARA PODER INTERACTURA*/
        editTextProducto = findViewById(R.id.edtProducto);
        editTextValor = findViewById(R.id.edtValor);
        editTextCantidad = findViewById(R.id.edtCantidad);
        txtViewResultado = findViewById(R.id.txtResultado2);
    }

private void resultado(){

    String producto = editTextProducto.getText().toString();
    String valor = editTextValor.getText().toString();
    String cantidad = editTextCantidad.getText().toString();

    if(!producto.isEmpty() && !valor.isEmpty() && !cantidad.isEmpty()){

        Double total = (Double.parseDouble(valor) + (Double.parseDouble(valor) * 0.12)) * Double.parseDouble(cantidad) ;
        txtViewResultado.setText(producto +": Q."+String.valueOf(total));

    } else {

        Toast.makeText(this, "Falta algún valor verifique", Toast.LENGTH_SHORT).show();

    }


}

    public void onClick(View view) {

    switch (view.getId()){

        case R.id.btnCalcular:
            resultado();
            break;

    }

    }
}