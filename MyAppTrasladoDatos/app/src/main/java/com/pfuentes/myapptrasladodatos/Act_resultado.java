package com.pfuentes.myapptrasladodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class Act_resultado extends AppCompatActivity {

    /* OBJETOS O ELEMENTOS A UTILIZAR */

    /*OBJETOS A UTILIZAR */

    private TextView texViewR, texViewO;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_resultado);
        /*ASOCIANDO OBJETO CON VARIABLES */

        texViewR = findViewById(R.id.txt_resultado);
        texViewO = findViewById(R.id.txt_otros);
        image = findViewById(R.id.img_titulo);

        /* METODOS QUE SE EJECUTARAN AUTOMATICAMENTE */
    obteniendoDatos();
    }


    private void obteniendoDatos(){

        // se agrega el objeto Bundle para obtener de forma optima los datos trasladados por
        // medio del intent

    Bundle bundle = getIntent().getExtras();
        String year = bundle.getString("year");

    //HACIENDO LA LOGICA DE AÑO BISIESTO:

    if( (Integer.parseInt(year) % 4 ==0) || (Integer.parseInt(year) % 400 ==0))
    { texViewR.setText("El año es Bisiesto");
    image.setImageResource(R.drawable.ic_bisiesto);
    }
    else
    { texViewR.setText("El año NO es Bisiesto");
        image.setImageResource(R.drawable.ic_calendar);
    }


     Calendar fecha = Calendar.getInstance();
        fecha.set(Integer.parseInt(year),1,0);
       int diastotal = fecha.getActualMaximum(Calendar.DAY_OF_YEAR);

       texViewO.setText(String.valueOf(diastotal));

    }
}