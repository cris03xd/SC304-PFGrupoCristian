package com.mycompany.sandwichguy;

import javax.swing.*;
import java.awt.*;

public class VentanaJuego extends JFrame {

    private Caja caja;
    private Mazo mazo;
    private JTextArea areaCaja;
    private JTextArea areaMazo;

    public VentanaJuego() {
        caja = new Caja();
        mazo = new Mazo();

        setTitle("The Sandwich Guy");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton btnBarajar = new JButton("Barajar");
        btnBarajar.addActionListener(e -> barajar());

        areaCaja = new JTextArea();
        areaMazo = new JTextArea();

        add(btnBarajar, BorderLayout.NORTH);
        add(new JScrollPane(areaCaja), BorderLayout.WEST);
        add(new JScrollPane(areaMazo), BorderLayout.EAST);

        actualizarVista();
    }

    private void barajar() {
        while (!caja.estaVacia()) {
            mazo.agregarCarta(caja.sacarCarta());
        }
        mazo.barajar();
        actualizarVista();
    }

    private void actualizarVista() {
        areaCaja.setText("Caja (" + caja.size() + ")\n" + caja.getCartas());
        areaMazo.setText("Mazo (" + mazo.size() + ")\n" + mazo.getCartas());
    }
}
