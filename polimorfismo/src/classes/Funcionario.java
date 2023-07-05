package classes;

public class Funcionario extends Pessoa {

    private double salarioFamilia;

    public Funcionario(String nome, double salario, double salarioFamilia) {
        super(nome, salario);
        this.salarioFamilia = salarioFamilia;
    }

    public double getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }
    
    @Override
    public double calcularSalario(){
        return super.getSalario() + getSalarioFamilia();
    }
    
    @Override
    public String toString(){
        return String.format(super.toString()
                            + "\nSalario Total: " + calcularSalario());
    }
}
