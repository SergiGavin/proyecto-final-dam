package com.example.proyectofinaldam.grupos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;



import com.example.proyectofinaldam.R;

import java.util.ArrayList;

public class adaptador_grupos extends BaseAdapter  {
    ArrayList<grupo> listaGrupos;

    Context context;

    public adaptador_grupos(ArrayList<grupo> listaGrupos, Context context){

        this.context = context;
        this.listaGrupos = listaGrupos;
    }
    @Override
    public int getCount() {
        return listaGrupos.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){

        LayoutInflater inflador = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vistaElemento = inflador.inflate(R.layout.listview_grupos, viewGroup, false);
        Spinner spinnerGrupo = (Spinner) vistaElemento.findViewById(R.id.SpinnnerGrupo);
        TextView nomGrupo = (TextView) vistaElemento.findViewById(R.id.tv_grupo);
        RadioButton rb_grupo = (RadioButton) vistaElemento.findViewById(R.id.rb_grupo);

        grupo grupo = listaGrupos.get(i);

        //spinnerGrupo;
        nomGrupo.setText(grupo.getNombre());
        //rb_grupo.setOnClickListener();

        vistaElemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Codigo para abrir ventana de creacion de grupo o informacion de grupo.
                //context.startActivity(intent);
            }
        });
        return vistaElemento;
    }


}
