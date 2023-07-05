package classes;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salario, double salarioFamilia, double bonus) {
        super(nome, salario, salarioFamilia);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + getBonus();
    }
    
    @Override
    public String toString(){
        return String.format(super.toString());
    }
}
