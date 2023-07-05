package classes;

import java.util.Scanner;

public class Veiculo extends Motor {
    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0.0f;
    }

    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public void insertData() {
        super.insertData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o peso (em quilos): ");
        peso = sc.nextInt();
        System.out.print("Digite a velocidade maxima (em Km/h): ");
        velocMax = sc.nextInt();
        System.out.print("Digite o preco (em R$): ");
        preco = sc.nextFloat();
    }

    public void print() {
        super.print();
        System.out.println("Dados do veiculo:");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Velocidade maxima: " + velocMax + " Km/h");
        System.out.println("Preco: R$ " + preco);
    }
}
