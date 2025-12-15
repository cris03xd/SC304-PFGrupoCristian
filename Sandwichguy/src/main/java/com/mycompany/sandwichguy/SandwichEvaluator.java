package com.mycompany.sandwichguy;

public class SandwichEvaluator {

    public static int evaluar(Carta a, Carta b, Carta c) {

        if (!esSandwich(a, b, c)) {
            return 0;
        }

        if (a.getPalo().equals(b.getPalo()) && b.getPalo().equals(c.getPalo())) {
            return 4;
        }

        if (a.getColor().equals(b.getColor()) && b.getColor().equals(c.getColor())) {
            return 3;
        }

        return 2;
    }

    private static boolean esSandwich(Carta a, Carta b, Carta c) {
        int ab = distancia(a.getValor(), b.getValor());
        int bc = distancia(b.getValor(), c.getValor());
        return ab == bc;
    }

    private static int distancia(int x, int y) {
        int diff = Math.abs(x - y);
        return Math.min(diff, 13 - diff);
    }
}
