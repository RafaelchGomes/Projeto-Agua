package com.mycompany.projeto.agua;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProjetoAgua {

    public static void main(String[] args) {
        CatalogoAgua catalog = new CatalogoAgua();
        Scanner input = new Scanner(System.in);

        // Adicionando produtos ao catálogo (Exemplos)
        catalog.adicionarAgua(new Produto("Santa Joana", 10.0, 1.5, 20, "02/05/2025", "SJ000 "));
        catalog.adicionarAgua(new Produto("Cristalina", 7.0, 0.5, 30, "05/06/2025", "SJ0000 "));
        catalog.adicionarAgua(new Produto("Terra Santa", 5.5, 1.5, 15, "06/04/2025", "SJ000 "));
        // ... adicione os outros produtos do seu catálogo

        System.out.println("Bem-vindo a Loja de Agua Online!");

        // Fluxo da aplicação baseado no diagrama
        boolean sair = false;
        while (!sair) {
            System.out.println("\nMenu Principal:");
            System.out.println("1 - Explorar Produtos");
            System.out.println("2 - Cadastro / Login");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = input.nextInt();
            input.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    catalog.exibirCatalogo();
                    System.out.println("Escolha o número do produto:");
                    int escolhaProduto = input.nextInt();
                    input.nextLine(); // Consumir a quebra de linha
                    Produto produtoSelecionado = catalog.getProduto(escolhaProduto - 1);
                    if (produtoSelecionado != null) {
                        System.out.println("Compra efetuada! Obrigado por escolher " + produtoSelecionado.getMarca() + ".");
                    } else {
                        System.out.println("Escolha Incorreta");
                    }
                    break;
                case 2:
                    // Implementar lógica de cadastro ou login
                    System.out.println("\nDigite seu nome:");
                    String nomeCliente = input.nextLine();
                    System.out.println("\nDigite seu endereço:");
                    String endereco = input.nextLine();
                    Cliente cliente = new Cliente(nomeCliente, endereco); // Criando um novo cliente
                    System.out.println(cliente.getNome());
                    System.out.println(cliente.getEndereco());
                    // ... (continuação do fluxo da aplicação, incluindo a criação do pedido)
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Obrigado por usar a loja de água online!");
        input.close();
    }
}
