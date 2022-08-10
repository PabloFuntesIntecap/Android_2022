package com.pfuentes.myappartes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



import java.util.ArrayList;

public class AdaperPerDetalleCategorias  extends BaseAdapter {

    private Context context;
    private int referenciaLista;
    private ListView listView;
    private ArrayList<Integer> A_imagenDetalle = new ArrayList<>();
    private ArrayList<String> A_titulodetalle = new ArrayList<>();
    private ArrayList<String> A_materialdetalle = new ArrayList<>();
    private ArrayList<String> A_preciodetalle = new ArrayList<>();

    /* lines de codigos automaticos al insertar un constructor */

    public AdaperPerDetalleCategorias(Context context, int referenciaLista, ArrayList<Integer> a_imagenDetalle, ArrayList<String> a_titulodetalle,
        ArrayList<String> a_materialdetalle, ArrayList<String> a_preciodetalle) {
        this.context = context;
        this.referenciaLista = referenciaLista;
        A_imagenDetalle = a_imagenDetalle;
        A_titulodetalle = a_titulodetalle;
        A_materialdetalle = a_materialdetalle;
        A_preciodetalle = a_preciodetalle;


    }

    @Override
    public int getCount() {

        return this.A_titulodetalle.size();
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

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.layout_detalle_categoria,null);

        int imgDetalle = this.A_imagenDetalle.get(i);
        String tituloDetalle = this.A_titulodetalle.get(i);
        String materialDetalle = this.A_materialdetalle.get(i);
        String precioDetalle = this.A_preciodetalle.get(i);

         ImageView imagenView = v.findViewById(R.id.img_detalle);
         TextView txtViewTitulo = v.findViewById(R.id.txt_titulo);
         TextView txtViewMaterial = v.findViewById(R.id.txt_material);
         TextView txtViewPrecio = v.findViewById(R.id.txt_precio);
         Button button = v.findViewById(R.id.btn_comprar);

         imagenView.setImageResource(imgDetalle);
         txtViewTitulo.setText(String.valueOf(tituloDetalle));
         txtViewMaterial.setText(String.valueOf(materialDetalle));
         txtViewPrecio.setText(String.valueOf(precioDetalle));



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            traslado2(imgDetalle,tituloDetalle,materialDetalle,precioDetalle);

            }

        });

        return v;

    }



    private void traslado2(int imagen, String titulo, String material, String precio )  {

        Intent intent = new Intent(context, MainProductoComprado.class);
        intent.putExtra("imagen",imagen);
        intent.putExtra("titulo",titulo);
        intent.putExtra("material",material);
        intent.putExtra("precio",precio);


        context.startActivity(intent);



    }


}
