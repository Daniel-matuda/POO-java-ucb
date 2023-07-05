package classes;

import java.util.Scanner;

public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {
        this.cor = "";
        this.modelo = "";
    }

    public CarroPasseio(int numCilindrada, int potencia, int peso, int velocMax, float preco, String cor, String modelo) {
        super(numCilindrada, potencia, peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void insertData() {
        super.insertData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a cor do carro: ");
        cor = sc.nextLine();
        System.out.print("Digite o modelo do carro: ");
        modelo = sc.nextLine();
    }

    public void print() {
        super.print();
        System.out.println("Dados do carro de passeio:");
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }
}
