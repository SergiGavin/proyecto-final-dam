package com.example.proyectofinaldam.gestion_grupos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinaldam.R;

public class AnnadirMiembros extends AppCompatActivity {

     private EditText etBuscador;
     private ImageButton ibBuscarEmpleado;
     private ListView lv_usuarios_buscados;
     private Button btn_annadir_usuario;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annadir_miembros);

        etBuscador = (EditText) findViewById(R.id.etBuscador);
        ibBuscarEmpleado = (ImageButton) findViewById(R.id.ibBuscarEmpleado);
        lv_usuarios_buscados = (ListView) findViewById(R.id.lv_usuarios_buscados);
        btn_annadir_usuario = (Button) findViewById(R.id.btn_annadir_usuario);


    }
}
