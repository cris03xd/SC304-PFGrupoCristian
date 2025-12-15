package com.mycompany.sandwichguy;

public class PermutacionResultado {

    private Carta a;
    private Carta b;
    private Carta c;
    private int valor;

    public PermutacionResultado(Carta a, Carta b, Carta c, int valor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return a + " " + b + " " + c + " -> " + valor;
    }
}
