package com.mycompany.sandwichguy;

import java.util.LinkedList;

public class Caja {

    private LinkedList<Carta> cartas;

    public Caja() {
        cartas = new LinkedList<>();
        crearBaraja();
    }

    private void crearBaraja() {
        String[] palos = {"Corazones", "Diamantes", "Picas", "Treboles"};
        String[] colores = {"Rojo", "Rojo", "Negro", "Negro"};
        String[] nombres = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (int i = 0; i < palos.length; i++) {
            for (int v = 0; v < nombres.length; v++) {
                cartas.add(new Carta(palos[i], colores[i], nombres[v], v + 1));
            }
        }
    }

    public boolean estaVacia() {
        return cartas.isEmpty();
    }

    public Carta sacarCarta() {
        if (cartas.isEmpty()) return null;
        return cartas.removeFirst();
    }

    public int size() {
        return cartas.size();
    }

    public LinkedList<Carta> getCartas() {
        return cartas;
    }
}
