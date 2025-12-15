package com.mycompany.sandwichguy;

public class NodoPermutacion {

    PermutacionResultado data;
    NodoPermutacion left;
    NodoPermutacion right;

    public NodoPermutacion(PermutacionResultado data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
