package com.pfuentes.myappartes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterPerCateogrias  extends BaseAdapter { /*se coloca el extends e implementamos los metodos abstractos */

    /*me maneja con un array list, contexto y referencia entero (es un recurso)*/

    private Context context;
    private int referenciaLista;

    ArrayList<Integer> imagenCategoria = new ArrayList<>();
    ArrayList<String> textoCategoria = new ArrayList<>();

 /* se debe de crear el constructor con todos los parametros creados abajo :)*/

    public AdapterPerCateogrias(Context context, int referenciaLista, ArrayList<Integer> imagenCategoria, ArrayList<String> textoCategoria) {
        this.context = context;
        this.referenciaLista = referenciaLista;
        this.imagenCategoria = imagenCategoria;
        this.textoCategoria = textoCategoria;
    }
/*ahora creamos un constructor vacio */

    public AdapterPerCateogrias(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.imagenCategoria.size(); /* esto se cambia para saber cuantos elementos tendrá el array */
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;

    /*para comunicarnos debemos de utilizar la siguiente sintax */

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.layout_cat_generales,null);

        /*ahora ya se puede intercatuar con el xml cat_generales */

        int idimagencat = this.imagenCategoria.get(i); /* variable y arraylist */
        String textCategoria = this.textoCategoria.get(i); /* variable y arraylist */

        /*relacionar xml con sus nuevos valores */
        ImageView imageView = v.findViewById(R.id.img_categoria);
        TextView textView = v.findViewById((R.id.txt_categoria));

        imageView.setImageResource(idimagencat);
        textView.setText(String.valueOf(textCategoria));

        return v;
    }
}
