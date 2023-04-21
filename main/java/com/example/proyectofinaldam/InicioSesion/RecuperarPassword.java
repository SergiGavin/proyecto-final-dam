package com.example.proyectofinaldam.InicioSesion;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.proyectofinaldam.R;


public class RecuperarPassword extends AppCompatActivity {
    private TextView tv_tituloRecuperar;
    private EditText et_emailRecuperar;
    private Button btn_enviarRecuperar;
    private TextView tv_volverInicioRecuperar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperar_password);



        tv_tituloRecuperar = findViewById(R.id.tv_titulo_recuperarpassw);
        et_emailRecuperar = findViewById(R.id.et_email);
        btn_enviarRecuperar = findViewById(R.id.btn_enviar);
        tv_volverInicioRecuperar = findViewById(R.id.tv_volverInicio);
        //Si el correo introducido existe en la base de datos al darle a enviar te enviara un codigo de verificacion
        // Se abrira una ventanita para introducir el codigo.
        btn_enviarRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se abre una ventana para introducir el codigo.
                ventanaCodigoRecuperar(v);

            }
        });
        //Este botón te devuelve al inicio
        tv_volverInicioRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
    //PONERLO EN GESTOR.
    //Este metodo genera una ventana pequeña encima de la pantalla recuperar contraseña.
    public void ventanaCodigoRecuperar(View v){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        CodigoRecuperacion codigoRecuperacion = new CodigoRecuperacion();

        // obtener las dimensiones de la pantalla
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int screenWidth = metrics.widthPixels;
        int screenHeight = metrics.heightPixels;

    // calcular los valores correspondientes al 0% del ancho y alto de la pantalla
        int dialogWidth = (int) (screenWidth * 0.7);
        int dialogHeight = (int) (screenHeight * 0.4);

    // crear un objeto Dialog y establecer el estilo personalizado y las dimensiones
        Dialog dialog = new Dialog(this, R.style.VentanaDialogRecuperar);
        dialog.setContentView(R.layout.codigo_recuperar2);
        Window window = dialog.getWindow();
        window.setLayout(dialogWidth, dialogHeight);

    // mostrar el diálogo
        codigoRecuperacion.show(transaction, "CodigoRecuperacion");

    }
}
