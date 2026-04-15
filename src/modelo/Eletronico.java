package modelo;

public class Eletronico extends Produto{

    private String serialNumber;
    private String tipo;

    public Eletronico(String nome, int codigo, double preco, int quantidadeEstoque, String serialNumber, String tipo) {
        super(nome, codigo, preco, quantidadeEstoque);
        this.serialNumber = serialNumber;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Eletronico{nome=" + getNome() + ", codigo=" + getCodigo() + ", Serial Number=" + serialNumber + ", tipo=" + tipo +  ", Quantidade em estoque=" + getQuantidadeEstoque() + "}" ;
    }
}
