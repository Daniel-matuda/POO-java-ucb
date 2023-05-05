package application;

import classes.Empregado;

public class EmpregadoTeste {

    public static void main(String[] args) {
        Empregado emp1 = new Empregado();
        Empregado emp2 = new Empregado();
        
        emp1.setSalarioMensal(2500);
        emp2.setSalarioMensal(5000);
        
        emp1.getSalarioAnual();
        emp2.getSalarioAnual();
        
        System.out.println("Salario anual do empregado 1: " + emp1.getSalarioAnual());
        System.out.println("Salario anual do empregado 2: " + emp2.getSalarioAnual());
        
        emp1.setAumentoPercentualSalario(10);
        emp2.setAumentoPercentualSalario(10);
        
        System.out.println("Salario anual do empregado 1: " + emp1.getSalarioAnual());
        System.out.println("Salario anual do empregado 2: " + emp2.getSalarioAnual());
    }
}