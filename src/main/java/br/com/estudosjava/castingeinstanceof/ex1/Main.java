package br.com.estudosjava.castingeinstanceof.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");

        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora posso usar o objeto "cachorro" como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
