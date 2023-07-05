package classes;

public class Animal {

    private String nome;
    private double peso;
    
    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nPeso: " + peso;
    }
}
