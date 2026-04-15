package servico;

import modelo.Produto;

import java.util.ArrayList;

public class GerenciadorEstoque {

    private ArrayList<Produto> lista = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        lista.add(produto);
    }

    public Produto buscarProduto(int codigo){
        for (Produto itemAtual : lista){
            if(itemAtual.getCodigo() == codigo){
                return itemAtual;
            }
        }
        return null;
    }

    public void atualizarQuantidade(int codigo, int novaQuantidade){
        Produto  produtoEncontrado = buscarProduto(codigo);

        if (produtoEncontrado != null){
            produtoEncontrado.setQuantidadeEstoque(novaQuantidade);
            System.out.println("Produto atualizado com sucesso");
        } else{
            System.out.println("Produto não encotrado");
        }

    }

    public void listarProdutos(){
        System.out.println("---Produtos---");
        for (Produto itemAtual : lista){
            System.out.println(itemAtual);
        }
    }

}
