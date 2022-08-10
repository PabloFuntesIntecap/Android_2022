package com.pfuentes.myappartes;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainDetalleCategoria extends AppCompatActivity {

    private ListView listView;
    private ImageView imageView;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detalle_categoria);

        listView = findViewById(R.id.list_detalle);
        textView = findViewById(R.id.txt_descripcionCategoria);

        obtenerDatos();
        descripcionCategoria();
        llenarLista();


    }
/* COLOCANDO LA DESCRIPCION DE LA CATEGORIA */

    private void descripcionCategoria(){



        switch (obtenerDatos()){

            case "Modernismo":
                textView.setText(R.string.descripcion_cat1);
            break;

            case "Armory Show":
                textView.setText(R.string.descripcion_cat2);
                break;

            case "Pintura Moderna":
                textView.setText(R.string.descripcion_cat3);
                break;
            default:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                break;
        }





    }
/*OBTENER DATOS DEL MAIN ACTIVITY*/

    private String obtenerDatos(){

    Bundle bundle = getIntent().getExtras();
    String categoria = bundle.getString("categoria");

    return categoria;

    }

    private void llenarLista(){

   AdaperPerDetalleCategorias detalleCategorias;

   switch (obtenerDatos()){

       case "Modernismo":

           detalleCategorias = new AdaperPerDetalleCategorias(this,R.layout.layout_detalle_categoria,
                   cat1_imagenes(), cat1_titulos(),cat1_materiales(),cat1_precios());

           listView.setAdapter(detalleCategorias);


        break;

       case "Armory Show":
           detalleCategorias = new AdaperPerDetalleCategorias(this,R.layout.layout_detalle_categoria,
                   cat2_imagenes(), cat2_titulos(),cat2_materiales(),cat2_precios());

           listView.setAdapter(detalleCategorias);
       break;

       case "Pintura Moderna":
           detalleCategorias = new AdaperPerDetalleCategorias(this,R.layout.layout_detalle_categoria,
                   cat3_imagenes(), cat3_titulos(),cat3_materiales(),cat3_precios());

           listView.setAdapter(detalleCategorias);
       break;
       
       default:
           Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
       break;
   }


    }

    /* ARREGLOS DETALLE DE LAS PINTURAS */

    private ArrayList<String> cat1_titulos(){

        ArrayList<String> titulos = new ArrayList<>();

        titulos.add("TITULO: F. Champenois Imprimeur-Editeur (1897)");
        titulos.add("TITULO: Gabinete de Louis Majorelle");
        titulos.add("TITULO: Aubrey Beardsley - The Dancer's Reward");

        return titulos;
    }
    private ArrayList<String> cat1_materiales(){

        ArrayList<String> materiales = new ArrayList<>();

        materiales.add("MATERIAL FÍSICO: IMPRESO");
        materiales.add("MATERIAL FÍSICO: REPLICA EN MADERA");
        materiales.add("MATERIAL FÍSICO: IMPRESO");

        return materiales;
    }
    private ArrayList<String> cat1_precios(){

        ArrayList<String> precios = new ArrayList<>();

        precios.add("PRECIO: Q 3,250.00");
        precios.add("PRECIO: Q 9,500.00");
        precios.add("PRECIO: Q 2,500.00");

        return precios;
    }
    private ArrayList<Integer> cat1_imagenes(){

        ArrayList<Integer> imagenes = new ArrayList<>();

        imagenes.add(R.drawable.ic_cat01_pic01);
        imagenes.add(R.drawable.ic_cat01_pic02);
        imagenes.add(R.drawable.ic_cat01_pic03);

        return imagenes;

    }

    /* -----------------------------------------------------------------------------------------*/

    private ArrayList<String> cat2_titulos(){

        ArrayList<String> titulos = new ArrayList<>();

        titulos.add("TITULO: Spielende nackte Menschen");
        titulos.add("TITULO: Vincent van Gogh, Self-Portrait, c. 1887");
        titulos.add("TITULO: Henri Rousseau, 1910, Cheval attaqué par un jaguar (Jaguar Attacking a Horse)");

        return titulos;
    }
    private ArrayList<String> cat2_materiales(){

        ArrayList<String> materiales = new ArrayList<>();

        materiales.add("MATERIAL FÍSICO: OLEO");
        materiales.add("MATERIAL FÍSICO: OLEO");
        materiales.add("MATERIAL FÍSICO: OLEO");

        return materiales;
    }
    private ArrayList<String> cat2_precios(){

        ArrayList<String> precios = new ArrayList<>();

        precios.add("PRECIO: Q 36,000.00");
        precios.add("PRECIO: Q 25,000.00");
        precios.add("PRECIO: Q 35,000.00");

        return precios;
    }

    private ArrayList<Integer> cat2_imagenes(){

        ArrayList<Integer> imagenes = new ArrayList<>();

        imagenes.add(R.drawable.ic_cat02_pic01);
        imagenes.add(R.drawable.ic_cat02_pic02);
        imagenes.add(R.drawable.ic_cat02_pic03);

        return imagenes;

    }
    /* -----------------------------------------------------------------------------------------*/

    private ArrayList<String> cat3_titulos(){

        ArrayList<String> titulos = new ArrayList<>();

        titulos.add("TITULO: German: Die kleine Stadt II (Ansicht von Krumau an der Moldau)");
        titulos.add("TITULO: Guerard Mount Townsend 1863 North-east view from the northern top of Mount Kosciusko");
        titulos.add("TITULO: The Street Enters the House");

        return titulos;
    }
    private ArrayList<String> cat3_materiales(){

        ArrayList<String> materiales = new ArrayList<>();

        materiales.add("MATERIAL FÍSICO: IMPRESO");
        materiales.add("MATERIAL FÍSICO: IMPRESO");
        materiales.add("MATERIAL FÍSICO: OLEO");

        return materiales;
    }
    private ArrayList<String> cat3_precios(){

        ArrayList<String> precios = new ArrayList<>();

        precios.add("PRECIO: Q 1,500.00");
        precios.add("PRECIO: Q 3,200.00");
        precios.add("PRECIO: Q 23,000.00");

        return precios;
    }
    private ArrayList<Integer> cat3_imagenes(){

        ArrayList<Integer> imagenes = new ArrayList<>();

        imagenes.add(R.drawable.ic_cat03_pic01);
        imagenes.add(R.drawable.ic_cat03_pic02);
        imagenes.add(R.drawable.ic_cat03_pic03);

        return imagenes;

    }

}