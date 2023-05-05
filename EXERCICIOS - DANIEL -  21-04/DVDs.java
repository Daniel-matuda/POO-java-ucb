package classes;

public class DVDs {

    private String nome;
    private double preco;
    private int duracao;

    public DVDs(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public String toString() {
        return "Nome do DVD: " + nome + "\nPreco: R$" + preco + "\nDuracao: " + duracao + " minutos";
    }
}