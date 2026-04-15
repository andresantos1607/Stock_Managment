package modelo;

import java.time.LocalDate;

public class Alimento extends Produto {

    private String dataDeValidade;
    private boolean isPerecivel;


    public Alimento(String nome, int codigo, double preco, int quantidadeEstoque, String dataDeValidade, boolean isPerecivel) {
        super(nome, codigo, preco, quantidadeEstoque);
        this.dataDeValidade = dataDeValidade;
        this.isPerecivel = isPerecivel;
    }

    @Override
    public String toString() {
        return "Alimento {nome= " + getNome() + ", codigo= " + getCodigo() + ", data de validade= " + dataDeValidade + ", É perecível= " + isPerecivel + '}';
    }
}
