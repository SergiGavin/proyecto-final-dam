package com.example.proyectofinaldam.gestion_grupos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinaldam.R;

public class ModificarGrupo extends AppCompatActivity {

    private EditText et_modif_nombre_grupo;
    private EditText et_modif_descripcion_grupo;
    private Spinner spinner_modif_colores;
    private Spinner spn_colores_grupo;
    private Button btn_modif_eliminar_miembro;
    private Button btn_modif_annadir_miembros;
    private ListView lv_modif_miembros_annadidos;
    private Button btn_modif_borrar_grupo;


    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.modificar_grupo);

        et_modif_nombre_grupo = (EditText) findViewById(R.id.et_modif_nombre_grupo);
        et_modif_descripcion_grupo = (EditText) findViewById(R.id.et_modif_descripcion_grupo);
        spinner_modif_colores = (Spinner) findViewById(R.id.spinner_modif_colores);
        spn_colores_grupo = (Spinner) findViewById(R.id.spn_colores_grupo);
        btn_modif_eliminar_miembro = (Button) findViewById(R.id.btn_modif_eliminar_miembro);
        btn_modif_annadir_miembros = (Button) findViewById(R.id.btn_modif_annadir_miembros);
        lv_modif_miembros_annadidos = (ListView) findViewById(R.id.lv_modif_miembros_annadidos);
        btn_modif_borrar_grupo = (Button) findViewById(R.id.btn_modif_borrar_grupo);
        
    }
}
