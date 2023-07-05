package classes;

import java.util.Scanner;

public class Caminhao extends Veiculo {
    private int toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        this.toneladas = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    public Caminhao(int numCilindrada, int potencia, int peso, int velocMax, float preco, int toneladas, int alturaMax, int comprimento) {
        super(numCilindrada, potencia, peso, velocMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void insertData() {
        super.insertData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a carga maxima (em toneladas): ");
        toneladas = sc.nextInt();
        System.out.print("Digite a altura maxima (em metros): ");
        alturaMax = sc.nextInt();
        System.out.print("Digite o comprimento (em metros): ");
        comprimento = sc.nextInt();
    }

    public void print() {
        super.print();
        System.out.println("Dados do caminhao:");
        System.out.println("Carga maxima: " + toneladas + " toneladas");
        System.out.println("Altura maxima: " + alturaMax + " metros");
        System.out.println("Comprimento: " + comprimento + " metros");
    }
}
