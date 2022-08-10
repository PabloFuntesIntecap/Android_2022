package com.pfuentes.appmultilistas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterPersonalizadoPrincipal extends BaseAdapter {

    private Context context;
    private int referenciaLista;
    ArrayList<Integer> userImages = new ArrayList<>();
    ArrayList<String> userNames = new ArrayList<>();

    public AdapterPersonalizadoPrincipal(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {

        return this.userNames.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        View v = view;

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.lista_personalizada, null);


        int userIng = this.userImages.get(i);
        String userName = this.userNames.get(i);

        ImageView imageView = v.findViewById(R.id.imgUserList);
        TextView textView =  v.findViewById(R.id.txtUserNameList);
/* 3 pasos */

        imageView.setImageResource(userIngDato);
        textView.setText(String.valueOf(UserNameDato));
        return v;
    }
}
