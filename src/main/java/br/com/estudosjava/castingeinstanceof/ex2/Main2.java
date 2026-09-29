package br.com.estudosjava.castingeinstanceof.ex2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        // Lista de Formas
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        // Calcular e imprimir a área de cada forma
        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
