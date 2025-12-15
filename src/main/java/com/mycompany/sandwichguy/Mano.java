package com.mycompany.sandwichguy;

import java.util.LinkedList;

public class Mano {

    private LinkedList<Carta> cartas;

    public Mano() {
        cartas = new LinkedList<>();
    }

    public boolean agregarCarta(Carta carta) {
        if (cartas.size() >= 8) return false;
        cartas.add(carta);
        return true;
    }

    public LinkedList<Carta> getCartas() {
        return cartas;
    }

    public int size() {
        return cartas.size();
    }
}
