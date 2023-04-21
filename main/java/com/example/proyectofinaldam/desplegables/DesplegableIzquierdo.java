package com.example.proyectofinaldam.desplegables;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinaldam.R;
import com.example.proyectofinaldam.gestion_grupos.CrearGrupo;
import com.example.proyectofinaldam.gestion_grupos.ModificarGrupo;

public class DesplegableIzquierdo extends AppCompatActivity {

    private TextView btn_crear_grupo;
    private ListView lv_grupos_desplegable;
    private TextView btn_mostrar_eventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desplegable_izquierdo);

        btn_crear_grupo = (TextView) findViewById(R.id.btn_crear_grupo);
        lv_grupos_desplegable = (ListView) findViewById(R.id.lv_grupos_desplegable);
        btn_mostrar_eventos = (TextView) findViewById(R.id.btn_mostrar_eventos);

        }

        public void LlamadaCrearGrupo(View view){

            Intent intent = new Intent(this, CrearGrupo.class);
            startActivity(intent);

        }

        public void LlamadaMostrarEventosCalendario(View view){

            Intent intent = new Intent(this, ModificarGrupo.class);
            startActivity(intent);

        }
}
