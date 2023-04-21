package com.example.proyectofinaldam.InicioSesion;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.proyectofinaldam.PantallaPrincipal;
import com.example.proyectofinaldam.R;


public class Login extends AppCompatActivity {
    private EditText etUsuario;
    private EditText etPassword;
    private Button btnLogin;
    private Button btnRecupContraseña;
    private TextView  tvLogin;
    private TextView tv_registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        tvLogin = findViewById(R.id.tv_login);
        etUsuario = findViewById(R.id.et_usuario);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        btnRecupContraseña = findViewById(R.id.btn_recuperar_password);
        tv_registro = findViewById(R.id.tv_registro);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CODIGO INICIO SESION SI DATOS SON CORRECTOS
                Intent irPantallaPrincipal = new Intent(Login.this, PantallaPrincipal.class);
                startActivity(irPantallaPrincipal);
            }
        });
        //Al darle a recuperar contraseña nos lleva a la ventana introducir correo electronico.
        btnRecupContraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irRecuperarPassw = new Intent(Login.this , RecuperarPassword.class);
                startActivity(irRecuperarPassw);
            }
        });
        tv_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irRegistro = new Intent(Login.this, Registro.class );
                startActivity(irRegistro);
            }
        });

    }

}
