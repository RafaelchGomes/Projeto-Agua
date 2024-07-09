package com.mycompany.projeto.agua;
import java.util.ArrayList;

class Pedido {
    private Cliente cliente;
    private ArrayList<Produto> itens;
    private double valorTotal;
    private String formaPagamento;
    // Outros dados relevantes do pedido, como data, status, etc.

    // Construtor, getters e setters

    public void adicionarItem(Produto agua) {
        itens.add(agua);
        // Atualizar valorTotal
    }

    public void removerItem(Produto agua) {
        itens.remove(agua);
        // Atualizar valorTotal
    }
}
