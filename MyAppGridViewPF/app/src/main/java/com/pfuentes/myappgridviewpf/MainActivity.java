package com.pfuentes.myappgridviewpf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 /*PASO 1*/ private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*PASO 2 */
        gridView = findViewById(R.id.GridAnimalesDomes);

        /*PASO 4*/
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, this.animales());
        /*PASO 5*/
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "A Seleccionado: " + animales().get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    /*METODOS DE TIPO STRING  PASO 3 */

    private ArrayList<String> animales(){

        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Hamster");
        animales.add("Loro");
        animales.add("Tortuga");
        animales.add("Perico");

    return animales;
    }

}