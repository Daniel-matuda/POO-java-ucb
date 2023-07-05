package classes4;

import java.util.Scanner;

public class MedicoCirurgiao extends Medico {

    private double numeroDeCirurgias;

    public MedicoCirurgiao(String nome, double salario, String crm, double numeroDeCirurgias) {
        super(nome, salario, crm);
        this.numeroDeCirurgias = numeroDeCirurgias;
    }

    public double calcularSalario() {
        return getSalario() + (numeroDeCirurgias * 350.0);
    }
    
    public double getNumeroDeCirurgias() {
        return numeroDeCirurgias;
    }

    public void setNumeroDeCirurgias(double numeroDeCirurgias) {
        this.numeroDeCirurgias = numeroDeCirurgias;
    }

    public void fazerCirurgia(Paciente paciente) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Realizando cirurgia no/a paciente " + paciente.getNome() + "...");
        paciente.setEstado("Em recuperacao");
        sc.nextLine();
        System.out.println("Paciente " + paciente.getNome() + " esta em recuperacao.");
    }

}
