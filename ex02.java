package ListaAula;
import java.util.Scanner;

public class Exercicio2 {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo!");
        System.out.println("Selecione seu prato desejado: ");
        System.out.println("1 - FRANGO");
        System.out.println("2 - FRUTOS DO MAR");
        System.out.println("3 - PRATO VEGANO");
        System.out.println("4 - PICANHA");
        int prato = sc.nextInt();
        System.out.println("Escolha um prato para a sobremesa: ");
        System.out.println("1 para - UVAS");
        System.out.println("2 para - DOCES");
        System.out.println("3 para  CREME DE NUTELLA");
        System.out.println("4 para CHOCOLATE");
        int sobremesa = sc.nextInt();
        System.out.println("Escolha o que deseja beber: ");
        System.out.println("1 para Cha");
        System.out.println("2 para Suco de laranja");
        System.out.println("3 para Suco de melao");
        System.out.println("4 para Refrigerante diet");
        int bebida = sc.nextInt();
        int countCalorias = 0;
        switch (prato){
            case 1:
                countCalorias += 180;
                break;
            case 2:
                countCalorias += 230;
                break;
            case 3:
                countCalorias += 250;
                break;
            case 4:
                countCalorias += 350;
                break;
            default:
                System.out.println("Opcao de prato invalida.");
        }
        switch (sobremesa) {
            case 1:
                countCalorias += 75;
                break;
            case 2:
                countCalorias += 110;
                break;
            case 3:
                countCalorias += 170;
                break;
            case 4:
                countCalorias += 200; 
            default:
                System.out.println("Opcao de sobremesa invalida.");
        }
        switch (bebida) {
            case 1:
                countCalorias += 20;
                break;
            case 2:
                countCalorias += 70;
                break;
            case 3:
                countCalorias += 100;
                break;
            case 4:
                countCalorias += 65; 
            default:
                System.out.println("Opcao de bebida invalida.");
        }
        System.out.printf("O menu escolhida possui %d calorias.%n", countCalorias);       
 }
    
}
