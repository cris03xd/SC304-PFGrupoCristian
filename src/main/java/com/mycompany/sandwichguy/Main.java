package com.mycompany.sandwichguy;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new VentanaJuego().setVisible(true);
            
            Carta c1 = new Carta("♣", "Negro", "A", 1);
Carta c2 = new Carta("♣", "Negro", "3", 3);
Carta c3 = new Carta("♣", "Negro", "5", 5);

var resultados = Permutador.generar(c1, c2, c3);

ArbolPermutaciones arbol = new ArbolPermutaciones();

for (var r : resultados) {
    arbol.insertar(r);
}

System.out.println("=== TODAS LAS PERMUTACIONES ===");
arbol.mostrar();

System.out.println("\n=== MEJOR COMBINACIÓN ===");
System.out.println(arbol.obtenerMejor());


        });
    }
}
