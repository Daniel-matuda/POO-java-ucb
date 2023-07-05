//2. Crie uma classe chamada Empresa capaz de armazenar os dados de uma empresa (Nome, Endereço, Cidade, 
//Estado, CEP e Fone). Inclua um construtor sem argumentos e um que receba os dados como argumentos e os 
//inicialize. Escreva duas funções, uma para fazer a interface com o usuário da entrada de dados, Insert(),
//e outra para imprimir os dados, Print(). 
//
//Use a classe Empresa como base para criar a classe Restaurante. Inclua o tipo de comida, o preço médio 
//de um prato, duas funções construtoras, a interface de entrada de dados, InsertData(), e a função que 
//imprima os dados, Print(). Construa um programa para testar a classe Restaurante.

package classes;

import java.util.Scanner;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String CEP;
    private String telefone;

    public Empresa() {
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String CEP, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
        this.telefone = telefone;
    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da empresa: ");
        nome = sc.nextLine();
        System.out.print("Digite o endereco: ");
        endereco = sc.nextLine();
        System.out.print("Digite a cidade: ");
        cidade = sc.nextLine();
        System.out.print("Digite o estado: ");
        estado = sc.nextLine();
        System.out.print("Digite o CEP: ");
        CEP = sc.nextLine();
        System.out.print("Digite o telefone: ");
        telefone = sc.nextLine();
    }

    public void print() {
        System.out.println("Dados da empresa:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + CEP);
        System.out.println("Telefone: " + telefone);
    }
}





