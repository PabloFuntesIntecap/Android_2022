package com.pfuentes.myappartes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

/*paso 1*/    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*paso 2*/ listView = findViewById(R.id.list_categorias);

        /*paso 3 creamos nuestro propio arrayadapter */

        /*al final se llama la clase que tendrá las imagenes y categorias */

    AdapterPerCateogrias adCategorias = new AdapterPerCateogrias(getApplicationContext(), R.layout.layout_cat_generales,imagesCategoria(),nombresCategoria());

      listView.setAdapter(adCategorias);  /* HASTA AQUI LLAMARA TODO LA PROGRA QUE SE HIZO */

    /*para accionar la lista como si fuera un boton*/

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        traslado1(position);

        }
    });
    }

 /*CREAR LOS METODOS DE TIPO ARRAY*/

 private ArrayList<Integer> imagesCategoria(){

     ArrayList<Integer> imagesCategoria = new ArrayList<>();

     imagesCategoria.add(R.drawable.ic_titulocat1);
     imagesCategoria.add(R.drawable.ic_titulocat2);
     imagesCategoria.add(R.drawable.ic_titulocat3);

     return imagesCategoria;

 }
 private ArrayList<String> nombresCategoria(){
     ArrayList<String> nombresCategoria = new ArrayList<>();

    nombresCategoria.add("Modernismo");
    nombresCategoria.add("Armory Show");
    nombresCategoria.add("Pintura Moderna");

    return nombresCategoria;

 }

 private void traslado1 (int position){


     Intent intent = new Intent(getApplicationContext(),MainDetalleCategoria.class);
     intent.putExtra("categoria",nombresCategoria().get(position));
     startActivity(intent);



 }
}