package br.com.alura.principal;

import br.com.alura.modelo.Alimento;
import br.com.alura.modelo.Eletronico;
import br.com.alura.modelo.Produto;
import br.com.alura.servico.GerenciadorEstoque;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque estoque = new GerenciadorEstoque();
        Scanner teclado = new Scanner(System.in);
        int opcao = 1;
        while (opcao != 0) {
            System.out.println("\n--- MENU ESTOQUE ---\n");
            System.out.println("1 - Adicionar produto\n2 - Listar produto\n3 - Atualizar quantidade\n4 - remover produto\n0 - Sair");
            opcao = teclado.nextInt();
            if (opcao == 1) {
                System.out.println("Digite 1 para adicionar eletrônico ou 2 para adicionar alimento: ");
                int escolha = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Digite o nome do produto: ");
                String nome = teclado.nextLine();
                System.out.println("Digite o codigo do produto: ");
                int codigo = teclado.nextInt();
                System.out.println("Digite o valor do produto: ");
                double valor = teclado.nextDouble();
                System.out.println("Digite a quantidade do produto: ");
                int quantidade = teclado.nextInt();
                if (escolha == 1) {
                    System.out.println("Digite o serial number do produto: ");
                    teclado.nextLine();
                    String serialNumber = teclado.nextLine();
                    System.out.println("Digite o tipo do produto: ");
                    String tipo = teclado.nextLine();

                    Eletronico celular = new Eletronico(nome, codigo, valor, quantidade, serialNumber, tipo);
                    estoque.adicionarProduto(celular);
                    System.out.println("\nAparelho adicionado com sucesso!");
                }
                if (escolha == 2) {
                    System.out.println("Digite a data de validade: ");
                    teclado.nextLine();
                    String dataValidade = teclado.nextLine();
                    System.out.println("É perecível? ");
                    boolean isPerecivel = teclado.nextBoolean();
                    teclado.nextLine();

                    Alimento alimento = new Alimento(nome,  codigo, valor, quantidade, dataValidade, isPerecivel);
                    estoque.adicionarProduto(alimento);
                    System.out.println("Alimento adicionado com sucesso!");
                }


            } else if (opcao == 2) {
                estoque.listarProdutos();

            } else if (opcao == 3) {
                System.out.println("Digite o código do produto: ");
                int codigoAtualizar = teclado.nextInt();
                System.out.println("Digite 1 para adicionar e 2 para remover produto: ");
                int selecao = teclado.nextInt();

                if (selecao == 1){
                    System.out.println("Quanto foi adicionado?");
                    int somaQuantidade = teclado.nextInt();
                    somaQuantidade +=
                    estoque.atualizarQuantidade(codigoAtualizar,  somaQuantidade);
                    System.out.println("Produto atualizado com sucesso!");
                } else if (selecao == 2){

                }

            } else if (opcao == 4) {
                System.out.println("Digite o código do produto: ");
                int codigoRemover = teclado.nextInt();
                estoque.removerProduto(codigoRemover);
                System.out.println("Produto removido com sucesso!");
            } else if (opcao == 0) {

            } else {
                System.out.println("Opção digitada inválida!");

            }
        }

        System.out.println("--- SISTEMA ENCERRADO ---");
        teclado.close();









    }
}
