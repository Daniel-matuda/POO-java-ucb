package classes;

public abstract class Pessoa {
    private String nome;
    private double salario;

    //metodo construtor
    
    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 1300) {
            this.salario = salario;
        } else {
            System.out.println("Valor menor que o salario minimo");
        }
    }
    
    //assinatura do metodo abstrato
    public abstract double calcularSalario();
    
    @Override
    public String toString(){
        return String.format("Nome: " + getNome()
                + "\nSalario: " + getSalario());
    }
}