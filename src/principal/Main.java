package principal;

import modelo.Eletronico;
import modelo.Produto;
import servico.GerenciadorEstoque;

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque estoque = new GerenciadorEstoque();

        Eletronico meuCelular = new Eletronico("Celular",1, 1002.0, 2, "123456", "Aparelho");

        estoque.adicionarProduto(meuCelular);
        estoque.listarProdutos();



    }
}
