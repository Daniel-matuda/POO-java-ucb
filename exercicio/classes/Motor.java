//3. Escreva um programa para armazenar dados de veículos.
//
//Primeiramente, crie a classe Motor que contém NumCilindro (int) e Potenci(int). Inclua um construtor 
//sem argumentos que inicialize os dados com zeros e um que inicialize os dados com os valores recebidos 
//como argumento. Acrescente duas funções, uma para a entrada de dados, InsertData(), e uma que imprima 
//os dados, Print().
//
//Escreva a classe Veiculo derivada da classe Motor contendo Peso em quilos (int), VelocMax em Km/h (int) 
//e Preco em R$ (float). Inclua um construtor sem argumentos que inicialize os dados com os valores recebidos 
//como argumento. Acrescente duas funções, uma para a entrada de dados, InsertData(), e uma que imprima 
//os dados, Print().
//
//Crie uma classe CarroPasseio derivada das classes Motor e Veículo como base. Inclua Cor (string) e Modelo
//(string). Inclua um construtor sem argumentos que inicialize os dados com zeros e uma que inicialize os 
//dados com os valores recebidos como argumentos. Acrescente duas funções, uma pára a entrada de dados, 
//InsertData(), e uma que imprima os dados, Print(). 
//
//Crie uma classe Caminhao derivada das classes Motor e Veiculo. Inclua Toneladas (carga máxima), 
//AlturaMax (int) e Comprimento (int). Inclua um construtor sem argumentos que inicialize os dados com 
//zeros e um que inicialize com os valores recebidos como argumento. Acrescente duas funções, uma para a 
//entrada de dados, InsertData(), e uma que imprima os dados, Print().
package classes;

import java.util.Scanner;

public class Motor {

    private int numCilindrada;
    private int potencia;

    public Motor() {
        numCilindrada = 0;
        potencia = 0;
    }

    public Motor(int numCilindrada, int potencia) {
        this.numCilindrada = numCilindrada;
        this.potencia = potencia;
    }
    
    public void insertData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de cilindros: ");
        numCilindrada = sc.nextInt();
        System.out.print("Digite a potencia: ");
        potencia = sc.nextInt();
    }
    
    public void print() {
        System.out.println("Dados do motor:");
        System.out.println("Numero de cilindros: " + numCilindrada);
        System.out.println("Potencia: " + potencia);
    } 
}
