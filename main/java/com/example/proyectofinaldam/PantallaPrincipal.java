package com.example.proyectofinaldam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinaldam.desplegables.DesplegableDerecho;
import com.example.proyectofinaldam.desplegables.DesplegableIzquierdo;
import com.example.proyectofinaldam.evento.CrearEvento;
import com.example.proyectofinaldam.gestion_grupos.AnnadirMiembros;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class PantallaPrincipal extends AppCompatActivity {

    private Button btn_despl_izquierdo;
    private Button btn_despl_derecho;
    private FloatingActionButton btn_calendario_crear_evento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);

        btn_despl_izquierdo = (Button) findViewById(R.id.btn_despl_izquierdo);
        btn_despl_derecho = (Button) findViewById(R.id.btn_despl_derecho);
        btn_calendario_crear_evento = (FloatingActionButton) findViewById(R.id.btn_calendario_crear_evento);

    }

    public void LlamadaDesplIzquierdo(View view){

        Intent intentDsplIzq = new Intent(this, DesplegableIzquierdo.class);
        startActivity(intentDsplIzq);

    }

    public void LlamadaCrearEvento(View view){

        Intent intentCrearEvento = new Intent(this, CrearEvento.class);
        startActivity(intentCrearEvento);

    }

    public void LlamadaDesplDerecho(View view){

        Intent intDspsDer = new Intent(this, DesplegableDerecho.class);
        startActivity(intDspsDer);

    }


}