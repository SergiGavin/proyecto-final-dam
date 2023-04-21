package com.example.proyectofinaldam.InicioSesion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinaldam.R;

public class GenerarNuevaPassword extends AppCompatActivity {
    private TextView tv_generarPassword;
    private EditText et_nuevaPassword1;
    private EditText et_nuevaPassword2;
    private Button btn_enviarPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generar_password);

        tv_generarPassword = findViewById(R.id.tv_generarPassword);
        et_nuevaPassword1 =  findViewById(R.id.et_nuevaPassword1);
        et_nuevaPassword2 = findViewById(R.id.et_nuevaPassword2);
        btn_enviarPassword = findViewById(R.id.btn_enviarNuevaPassword);

        //Boton que al darle comprobará que las contraseñas cumplen con los requisitos y al darle a enviar vuelvel al login
        btn_enviarPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "La nueva contraseña se ha generado correctamente", Toast.LENGTH_SHORT).show();
                Intent irLogin = new Intent(GenerarNuevaPassword.this, Login.class);
                startActivity(irLogin);
            }
        });
    }
}

