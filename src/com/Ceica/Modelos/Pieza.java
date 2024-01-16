package com.Ceica.Modelos;

public class Pieza {
    private int id;
    private String nombre, color;
    private Double precio;
    private Categoria categoria;

    public Pieza(String nombre, String color, Double precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }

}
