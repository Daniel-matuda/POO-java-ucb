package classes;

public class Livros {

    private String nome;
    private double preco;
    private String autor;

    public Livros(String nome, double preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    public String toString() {
        return "Nome do livro: " + nome + "\nPreco: R$" + preco + "\nAutor: " + autor;
    }
}