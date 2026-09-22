package br.com.estudosjava.construtores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Tamanho da Lista: "+ listaProdutos.size());
        System.out.println("Produto na Posição 0: " + listaProdutos.get(0).getNome());

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");

        System.out.println(produtoPerecivel);
    }
}