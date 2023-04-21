package com.example.proyectofinaldam.InicioSesion;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;


public class CodigoRecuperacion extends DialogFragment {
    private EditText et_codigoRecuperacion;
    private Button btn_codigoRecuperacion;
    private TextView tv_codigoRecuperacion;
    private Button btn_cancelarRecuperacion;


    public CodigoRecuperacion() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(com.example.proyectofinaldam.R.layout.codigo_recuperar2, container, false);


        btn_codigoRecuperacion = view.findViewById(com.example.proyectofinaldam.R.id.btn_codigoRecuperacion);
        btn_cancelarRecuperacion = view.findViewById(com.example.proyectofinaldam.R.id.btn_cancelar);

        //Realizamos el OnCLickListener del boton Validar
        btn_codigoRecuperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SE VERIFICARIA SI EL CODIGO ES CORRECTO. SI ES CORRECTO ABRE VENTANA PARA GENERAR NUEVA CONTRASEÑA
                Intent irIntroducirPassword = new Intent(getContext(), GenerarNuevaPassword.class);
                startActivity(irIntroducirPassword);
                //Se cierra cuando se verifique el codigo
                dismiss();

            }
        });
        //En el botón de cancelar se cierra la ventana pequeña con el dismiss()
        btn_cancelarRecuperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });


        return view;
    }
}