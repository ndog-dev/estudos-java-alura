package br.com.estudosjava.listasecolecoes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando Lista de Pessoas
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Criando Pessoas dentro do código com os atributos setados
        Pessoa pessoa1 = new Pessoa("Nathan", 23);
        Pessoa pessoa2 = new Pessoa("João Pedro", 18);
        Pessoa pessoa3 = new Pessoa("Kennedy", 34);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        // Imprimindo com size()
        System.out.println("Tamanho da Lista: " + listaDePessoas.size());

        // Imprimindo a primeira pessoa da lista usando a funcao get()
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));

        // Imprimindo lista completa
        System.out.println("Lista de Pessoas: ");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
