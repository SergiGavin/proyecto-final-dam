package com.example.proyectofinaldam.grupos;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;

import com.example.proyectofinaldam.R;

import java.util.List;

public class AdaptadorColores extends ArrayAdapter<Drawable> {

    Context context;
    List<Drawable> listaColores;

    public AdaptadorColores(Context context, int resource, List<Drawable> listaColores){
        super(context, resource, listaColores);
        this.context = context;
        this.listaColores = listaColores;
    }

    @Override
    public int getCount() {
        return listaColores.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View view = convertView;

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.color_spinner_item, null);

        }

        ImageView imageView = view.findViewById(R.id.imageView);
        GradientDrawable bolita = (GradientDrawable) listaColores.get(position);
        imageView.setImageDrawable(bolita);

        return view;
    }


}
