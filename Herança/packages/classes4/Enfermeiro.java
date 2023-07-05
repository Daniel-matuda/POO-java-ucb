package classes4;

import java.util.Scanner;

public class Enfermeiro extends Funcionario {

    private String coren;

    public Enfermeiro(String nome, double salario, String coren) {
        super(nome, salario);
        this.coren = coren;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public void darMedicacao(Paciente paciente) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dando medicacao ao/a paciente " + paciente.getNome() + " ...");
        paciente.setEstado("Medicado");
        sc.nextLine();
        System.out.println("Paciente " + paciente.getNome() + " medicado/a");
    }
}
