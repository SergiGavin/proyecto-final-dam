package com.example.proyectofinaldam.gestion_grupos;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.proyectofinaldam.R;
import com.example.proyectofinaldam.grupos.AdaptadorColores;

import java.util.ArrayList;

public class CrearGrupo extends AppCompatActivity {

    private EditText et_nombre_grupo;
    private EditText et_descripcion_grupo;
    private Spinner spn_colores_grupo;
    private Button btn_annadir_miembros;
    private ListView lv_miembros_annadidos;
    private Spinner spinner_colores;
    private GradientDrawable bolita;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_grupo);

        et_nombre_grupo = (EditText) findViewById(R.id.et_nombre_grupo);
        et_descripcion_grupo = (EditText) findViewById(R.id.et_descripcion_grupo);
        spn_colores_grupo = (Spinner) findViewById(R.id.spn_colores_grupo);
        btn_annadir_miembros = (Button) findViewById(R.id.btn_annadir_miembros);
        lv_miembros_annadidos = (ListView) findViewById(R.id.lv_miembros_annadidos);

        spinner_colores = (Spinner) findViewById(R.id.spinner_colores);

        ArrayList<String> coloresList = new ArrayList<>();
        coloresList.add("Rojo");
        coloresList.add("Amarillo");
        coloresList.add("Azul");
        coloresList.add("Verde");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, coloresList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spn_colores_grupo.setAdapter(adapter);

        //////////////////////////////////////////////////////////

        ArrayList<Drawable> coloresList1 = new ArrayList<>();
        coloresList1.add(ContextCompat.getDrawable(this, R.drawable.bolita_purpura));
        coloresList1.add(ContextCompat.getDrawable(this, R.drawable.bolita_cian));
        coloresList1.add(ContextCompat.getDrawable(this, R.drawable.bolita_negra));

        AdaptadorColores adaptadorColores2 = new AdaptadorColores(this,
                R.layout. color_spinner_item, coloresList1);

        spinner_colores.setAdapter(adaptadorColores2);

    }

    public void AnnadirMiembros(View view){

        Intent intent2 = new Intent(this, AnnadirMiembros.class);
        startActivity(intent2);

    }
}
