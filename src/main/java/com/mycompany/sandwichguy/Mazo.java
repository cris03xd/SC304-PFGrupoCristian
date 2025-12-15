package com.mycompany.sandwichguy;

import java.util.Collections;
import java.util.Stack;

public class Mazo {

    private Stack<Carta> cartas;

    public Mazo() {
        cartas = new Stack<>();
    }

    public void agregarCarta(Carta carta) {
        if (carta != null) {
            cartas.push(carta);
        }
    }

    public Carta sacarCarta() {
        if (cartas.isEmpty()) return null;
        return cartas.pop();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public int size() {
        return cartas.size();
    }

    public Stack<Carta> getCartas() {
        return cartas;
    }
}
