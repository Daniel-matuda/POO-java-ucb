package classes4;

import java.util.Scanner;

public class Medico extends Funcionario {
    private String crm;

    public Medico(String nome, double salario, String crm) {
        super(nome, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void atenderPaciente(Paciente paciente) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do/a paciente?");
        paciente.setNome(sc.nextLine());
        System.out.println("Qual a idade do/a paciente?");
        paciente.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.println("Qual o estado do/a paciente?");
        paciente.setEstado(sc.nextLine());
        System.out.println("Paciente registrado.");
    }
    
    public void darAlta(Paciente paciente) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando processo de alta medica do/a paciente " + paciente.getNome() + ".");
        paciente.setEstado("Curado");
        sc.nextLine();
        System.out.println("Paciente " + paciente.getNome() + " curado/a.");
    }
}

