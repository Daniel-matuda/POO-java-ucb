package ListaAula;
import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);  
        System.out.println("Insira o salario:  ");
        double salarioFixo  = sc.nextDouble();
        System.out.println("Insira o numero de carros que foram vendidos: ");
        int carrosVendidos = sc.nextInt();
        System.out.println("Insira a comissao por carro vendido: ");        
        double comissao = sc.nextDouble();
        System.out.println("Insira o valor total de carros vendidos: ");        
        double valorTotal = sc.nextDouble();
       double salarioFinal = (valorTotal*0.05) + (carrosVendidos * comissao) + salarioFixo;
       System.out.println("O salario final: R$"+salarioFinal);        
    }
}
