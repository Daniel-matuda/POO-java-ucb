package application;

import classes.Aluno;
import classes.Curso;
import classes.Endereco;
import classes.Professor;
import classes.Telefone;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso curso;
        ArrayList<Curso> cursos;

        Aluno aluno = new Aluno();
        ArrayList<Double> notas = new ArrayList<Double>();

        Telefone telefone;
        ArrayList<Telefone> telefones;

        Professor novoProf = new Professor();
        Endereco endereco;

//        Cadastro do professor
        
        System.out.println("---- Cadastro do Professor ----");
        System.out.println("Digite o nome do professor: ");
        novoProf.setNome(sc.nextLine());
        System.out.println("Digite o e-mail do professor: ");
        novoProf.setEmail(sc.nextLine());
        System.out.println("Digite o CPF do professor: ");
        novoProf.setCpf(sc.nextLine());

        endereco = new Endereco();
        System.out.println("Digite a rua: ");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite a cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.println("Digite o estado: ");
        endereco.setEstado(sc.nextLine());

        novoProf.setEndereco(endereco);

        telefones = new ArrayList<>();
        System.out.println("Digite os telefones do professor (maximo 2): ");
        for (int i = 0; i < 2; i++) {
            telefone = new Telefone();
            System.out.println("Digite o tipo do telefone: ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD: ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o numero: ");
            telefone.setNumero(sc.nextLine());
            telefones.add(telefone);
        }
        novoProf.setTelefones(telefones);
        
        System.out.println("Digite a titulacao: ");
        novoProf.setTitulacao(sc.nextLine());
        System.out.println("Digite o salario: ");
        novoProf.setSalario(sc.nextDouble());
        sc.nextLine();
        
        cursos = new ArrayList<>();
        System.out.println("Digite os cursos do professor - maximo 2");
        for (int i = 0; i < 2; i++) {
            curso = new Curso();
            System.out.println("Digite o nome do curso: ");
            curso.setNome(sc.nextLine());
            cursos.add(curso);
        }
        novoProf.setCursos(cursos);
        
//        Cadastro do Aluno

        System.out.println("---- Cadastro do Aluno ----");
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());
        System.out.println("Digite o e-mail do aluno: ");
        aluno.setEmail(sc.nextLine());
        System.out.println("Digite o CPF do aluno: ");
        aluno.setCpf(sc.nextLine());

        endereco = new Endereco();
        System.out.println("Digite a rua: ");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite a cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.println("Digite o estado: ");
        endereco.setEstado(sc.nextLine());

        aluno.setEndereco(endereco);
        
        telefones = new ArrayList<>();
        System.out.println("Digite os telefones do aluno (maximo 2): ");
        for (int i = 0; i < 2; i++) {
            telefone = new Telefone();
            System.out.println("Digite o tipo do telefone: ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD: ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o numero: ");
            telefone.setNumero(sc.nextLine());
            telefones.add(telefone);
        }
        aluno.setTelefones(telefones);
        
        curso = new Curso();
        System.out.println("Digite o curso do aluno: ");
        curso.setNome(sc.nextLine());
        aluno.setCurso(curso);
        
        System.out.println("Digite as notas do aluno: ");
        for (int i = 0; i < 2; i++) {
            notas.add(sc.nextDouble());
            
        }
        sc.nextLine();
        aluno.setNotas(notas);
        
//        Impressao

        novoProf.imprimir();
        System.out.println();
        aluno.imprimir();
        
    }

}
