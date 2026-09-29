package br.com.estudosjava.castingeinstanceof.ex2;

public class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        return Math.PI * lado  * lado;
    }
}
