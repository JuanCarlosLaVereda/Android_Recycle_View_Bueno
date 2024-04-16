package com.example.android_recycleview_bueno.model;

public class Profesion {
    private String nombre;
    private int image;

    public Profesion(String nombre, int image){
        this.nombre = nombre;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getNombre() {
        return nombre;
    }
}
