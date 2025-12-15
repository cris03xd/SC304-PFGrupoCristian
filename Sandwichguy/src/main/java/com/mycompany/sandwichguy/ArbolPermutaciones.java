package com.mycompany.sandwichguy;

public class ArbolPermutaciones {

    private NodoPermutacion root;

    public ArbolPermutaciones() {
        root = null;
    }

    public void insertar(PermutacionResultado pr) {
        root = insertarRec(root, pr);
    }

    private NodoPermutacion insertarRec(NodoPermutacion nodo, PermutacionResultado pr) {

        if (nodo == null) {
            return new NodoPermutacion(pr);
        }

        if (pr.getValor() < nodo.data.getValor()) {
            nodo.left = insertarRec(nodo.left, pr);
        } else {
            nodo.right = insertarRec(nodo.right, pr);
        }

        return nodo;
    }

    // Recorrido in-order (para mostrar)
    public void mostrar() {
        mostrarRec(root);
    }

    private void mostrarRec(NodoPermutacion nodo) {
        if (nodo != null) {
            mostrarRec(nodo.left);
            System.out.println(nodo.data);
            mostrarRec(nodo.right);
        }
    }

    // Devuelve el mejor resultado (el más alto)
    public PermutacionResultado obtenerMejor() {
        NodoPermutacion actual = root;
        if (actual == null) return null;

        while (actual.right != null) {
            actual = actual.right;
        }
        return actual.data;
    }
}
