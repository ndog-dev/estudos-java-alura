package br.com.estudosjava.castingeinstanceof.ex2;

public class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

