package classes;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }
    
    public void setAumentoPercentualSalario(double percent) {
        salarioMensal += salarioMensal * (percent/100);
    }
}