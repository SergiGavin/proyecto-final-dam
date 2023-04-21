package com.example.proyectofinaldam.grupos;

import java.util.List;

public class grupo {
    private String nombre;
    private String color;
    private String administrador;
    private List<String> miembros;
    //private List<Evento> eventos;
    //private Calendario calendario;

    public grupo(String nombre, String color, String administrador, List<String> miembros /*List<Evento> eventos, Calendario calendario*/) {
        this.nombre = nombre;
        this.color = color;
        this.administrador = administrador;
        this.miembros = miembros;
        /*this.eventos = eventos;
        this.calendario = calendario;*/
    }

    // getters y setters para cada atributo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public List<String> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<String> miembros) {
        this.miembros = miembros;
    }

   /* public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }*/
}
