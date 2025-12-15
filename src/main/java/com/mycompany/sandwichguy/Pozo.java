package com.mycompany.sandwichguy;

import java.util.LinkedList;
import java.util.Queue;

public class Pozo {

    private Queue<Carta> cartas;

    public Pozo() {
        cartas = new LinkedList<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.offer(carta);
    }

    public int size() {
        return cartas.size();
    }
}
