package com.pfuentes.appmultilistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
        private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listUser);

        AdapterPersonalizadoPrincipal principal = new AdapterPersonalizadoPrincipal(this,R.layout.lista_personalizada,image)
    }
}