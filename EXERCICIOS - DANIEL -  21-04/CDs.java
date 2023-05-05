package classes;

public class CDs {

    private String nome;
    private double preco;
    private int numeroFaixas;

    public CDs(String nome, double preco, int numeroFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numeroFaixas = numeroFaixas;
    }

    public String toString() {
        return "Nome do CD: " + nome + "\nPreco: R$" + preco + "\nNumero de faixas: " + numeroFaixas;
    }
}