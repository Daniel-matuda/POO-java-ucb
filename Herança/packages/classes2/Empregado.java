package classes2;

import classes2.Pessoa;

public class Empregado extends Pessoa {

    private double salario;
    private String matricula;

    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //eu já tinha feito o método com a porcentagem atualizada,
    //só depois que fui ler o enunciado. também fiz com o INSS
    //a 11%.
    /*
    public double getvalorINSS() {
        double valorINSS = 0.0;
        if (salario > 0.0 && salario <= 1302.0) {
            valorINSS = salario * (7.5 / 100.0);
        } else if (salario > 1302.0 && salario <= 2571.29) {
            valorINSS = salario * (9.0 / 100.0);
        } else if (salario > 2571.29 && salario <= 3856.94) {
            valorINSS = salario * (12.0 / 100.0);
        } else if (salario > 3856.94 && salario <= 7507.49) {
            valorINSS = salario * (14.0 / 100.0);
        } else {
            System.out.println("Valor de salario invalido");
        }
        return valorINSS;
    }
     */
    public double getvalorINSS() {
        double valorINSS = 0.0;
        valorINSS = salario * (11.0 / 100);
        return valorINSS;
    }

}
