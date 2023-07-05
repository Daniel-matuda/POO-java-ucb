package classes4;

import java.util.Scanner;

public class MedicoClinico extends Medico {

    private double numeroDeConsultas;

    public MedicoClinico(String nome, double salario, String crm, double numeroDeConsultas) {
        super(nome, salario, crm);
        this.numeroDeConsultas = numeroDeConsultas;
    }
    
    public double calcularSalario() {
        return getSalario() + (numeroDeConsultas * 100.0);
    }

    public double getNumeroDeConsultas() {
        return numeroDeConsultas;
    }

    public void setNumeroDeConsultas(double numeroDeConsultas) {
        this.numeroDeConsultas = numeroDeConsultas;
    }

    public void fazerExame(Paciente paciente) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Realizando exame no/a paciente " + paciente.getNome() + "...");
        paciente.setEstado("Sendo examinado/a");
        sc.nextLine();
        System.out.println("Paciente " + paciente.getNome() + " esta sendo examinado/a.");
    }

}
