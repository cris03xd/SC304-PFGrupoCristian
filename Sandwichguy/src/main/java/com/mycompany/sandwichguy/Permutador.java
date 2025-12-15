package com.mycompany.sandwichguy;

import java.util.ArrayList;
import java.util.List;

public class Permutador {

    public static List<PermutacionResultado> generar(Carta x, Carta y, Carta z) {

        List<PermutacionResultado> lista = new ArrayList<>();

        lista.add(crear(x, y, z));
        lista.add(crear(x, z, y));
        lista.add(crear(y, x, z));
        lista.add(crear(y, z, x));
        lista.add(crear(z, x, y));
        lista.add(crear(z, y, x));

        return lista;
    }

    private static PermutacionResultado crear(Carta a, Carta b, Carta c) {
        int valor = SandwichEvaluator.evaluar(a, b, c);
        return new PermutacionResultado(a, b, c, valor);
    }
}
