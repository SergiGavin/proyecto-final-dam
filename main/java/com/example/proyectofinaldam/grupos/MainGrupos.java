package com.example.proyectofinaldam.grupos;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.proyectofinaldam.R;

import java.util.ArrayList;

public class MainGrupos extends AppCompatActivity {
    ArrayList<grupo> listaGrupos = new ArrayList<grupo>();
    ListView lista;
    adaptador_grupos adp_grupo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desplegable_grupo);


        adp_grupo = new adaptador_grupos(listaGrupos, this);
        lista = (ListView) findViewById(R.id.lv_grupos);
        lista.setAdapter(adp_grupo);

    }
}
