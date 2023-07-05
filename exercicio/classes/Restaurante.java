package classes;

import java.util.Scanner;

public class Restaurante extends Empresa {

    private String tipoComida;
    private double precoMedioPrato;

    public Restaurante() {
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String CEP, String telefone,
            String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, CEP, telefone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public void insertData() {
        super.insert();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tipo de comida: ");
        tipoComida = sc.nextLine();
        sc.nextLine();
        System.out.print("Digite o preco medio de um prato: ");
        precoMedioPrato = sc.nextDouble();
    }

    public void print() {
        super.print(); // Imprime os dados da empresa utilizando o método print() da classe Empresa.
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Preco medio de um prato: " + precoMedioPrato);
    }
}
