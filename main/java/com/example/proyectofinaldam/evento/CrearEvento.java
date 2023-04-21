package com.example.proyectofinaldam.evento;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.proyectofinaldam.R;

public class CrearEvento extends AppCompatActivity {
    private EditText et_nombreEvento;
    private EditText et_fechaLimiteEncuesta;
    private EditText et_opcion1;
    private EditText et_opcion2;
    private EditText et_opcion3;
    private RadioGroup rdGroupTipoFecha;
    private RadioButton rdBtn_tipoFechaSi;
    private RadioButton rdBtn_tipoFechaNo;
    private Button btn_crear_evento;
    private Spinner sp_grupoEvento;
    private EditText et_descripcionCrearEvento;
    private TextView tv_preguntaTipoFecha;
    private TextView tv_fechaLimiteEncuesta;
    private TextView tv_diasElegirEncuesta;

    private EditText et_FechaFinalEvento;

    /**
     * Por default.
     * El grupo sera mi calendario y la fecha abierta sera no.
     */

    public CrearEvento(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_evento);



        //Vinculamos los componentes con los del layout.
        et_nombreEvento = findViewById(R.id.et_nombre_eventoCrearE);
        et_fechaLimiteEncuesta = findViewById(R.id.et_fechaLimiteEncuesta);
        et_FechaFinalEvento = findViewById(R.id.et_fechaFinalEvento);
        et_opcion1 = findViewById(R.id.et_opcion1);
        et_opcion2 = findViewById(R.id.et_opcion2);
        et_opcion3 = findViewById(R.id.et_opcion3);
        rdGroupTipoFecha = findViewById(R.id.rdGroup_tipoFecha);
        rdBtn_tipoFechaSi = findViewById(R.id.rdBtn_tipoFechaSi);
        rdBtn_tipoFechaNo = findViewById(R.id.rdBtn_tipoFechaNo);
        btn_crear_evento = findViewById(R.id.btn_crear_evento);
        sp_grupoEvento = findViewById(R.id.sp_grupoCrearE);
        et_descripcionCrearEvento   = findViewById(R.id.et_descripcionCrearE);
        tv_fechaLimiteEncuesta = findViewById(R.id.tv_fechaLimiteEncuesta);
        tv_diasElegirEncuesta = findViewById(R.id.tv_DiasElegir);





        //Creamos un array adapter y introducimos en el spinner datos de ejemplo.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, new String[]{"Opción 1", "Opción 2", "Opción 3"});
        sp_grupoEvento.setAdapter(adapter);


        rdBtn_tipoFechaSi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mostrarCampos();
                }
            }
        });
        rdBtn_tipoFechaNo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        ocultarCampos();
                    }
            }
        });





        //Realizamos un onclickListener para que al pulsar haga... boton Crear
        btn_crear_evento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //COMPROBARÁ QUE LO INTRODUCIDO ES CORRECTO Y GUARDARA EN BASE DE DATOS
                Toast.makeText(CrearEvento.this, "hola funciona", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void mostrarCampos(){


        tv_fechaLimiteEncuesta.setText("Fecha Encuesta:");
        et_fechaLimiteEncuesta.setVisibility(View.VISIBLE);
        tv_diasElegirEncuesta.setVisibility(View.VISIBLE);
        et_opcion1.setVisibility(View.VISIBLE);
        et_opcion2.setVisibility(View.VISIBLE);
        et_opcion3.setVisibility(View.VISIBLE);
        et_FechaFinalEvento.setVisibility(View.INVISIBLE);


    }
    public void ocultarCampos(){


        tv_fechaLimiteEncuesta.setText("Fecha:");
        et_fechaLimiteEncuesta.setVisibility(View.INVISIBLE);
        tv_diasElegirEncuesta.setVisibility(View.INVISIBLE);
        et_opcion1.setVisibility(View.INVISIBLE);
        et_opcion2.setVisibility(View.INVISIBLE);
        et_opcion3.setVisibility(View.INVISIBLE);
        et_FechaFinalEvento.setVisibility(View.INVISIBLE);
        et_FechaFinalEvento.setVisibility(View.VISIBLE);

    }

}










