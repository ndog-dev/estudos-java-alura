package br.com.estudosjava.castingeinstanceof.ex3;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Óleo", 12.79);
        Produto produto2 = new Produto("Azeite", 15.79);
        Produto produto3 = new Produto("Vinagre", 13.79);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
