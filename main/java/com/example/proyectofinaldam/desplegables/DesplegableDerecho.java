package com.example.proyectofinaldam.desplegables;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinaldam.R;

public class DesplegableDerecho extends AppCompatActivity {

    private Spinner spn_eventos_grupo;
    private Spinner spn_eventos_encuestas;
    private ListView lv_eventos_despl_derecho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desplegable_derecho);

        spn_eventos_grupo = (Spinner) findViewById(R.id.spn_eventos_grupo);
        spn_eventos_encuestas = (Spinner) findViewById(R.id.spn_eventos_encuestas);
        lv_eventos_despl_derecho = (ListView) findViewById(R.id.lv_eventos_despl_derecho);
    }
}
