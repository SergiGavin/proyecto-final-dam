package com.example.proyectofinaldam.InicioSesion;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinaldam.R;

public class Registro extends AppCompatActivity {
    private EditText et_usuarioRegistro;
    private EditText et_passwordRegistro;
    private EditText et_correoRegistro;
    private Button btn_registro;
    private TextView tv_registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        et_usuarioRegistro = findViewById(R.id.et_usuarioRegistro);
        et_passwordRegistro = findViewById(R.id.et_passwordRegistro);
        et_usuarioRegistro = findViewById(R.id.et_correoRegistro);
        btn_registro = findViewById(R.id.btn_registro);

        //Al darle al boton comprobara el formato de los datos, si ya existe y en el caso que no exista
        // se guardara en la base de datos.
        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Se ha registrado con éxito", Toast.LENGTH_SHORT).show();
                Intent irLogin = new Intent(Registro.this, Login.class);
                startActivity(irLogin);
            }
        });

    }
}
