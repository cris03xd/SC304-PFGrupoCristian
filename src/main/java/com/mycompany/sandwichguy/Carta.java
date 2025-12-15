package com.mycompany.sandwichguy;

public class Carta {

    private final String palo;
    private final String color;
    private final String nombre;
    private final int valor;

    public Carta(String palo, String color, String nombre, int valor) {
        this.palo = palo;
        this.color = color;
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "[" + nombre + " | " + palo + "]";
    }
}
