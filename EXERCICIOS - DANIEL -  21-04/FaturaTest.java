package application;

import java.util.Scanner;
import classes.Fatura;

public class FaturaTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fatura ft = new Fatura();

        System.out.println("Digite o numero da fatura: ");
        String numero = sc.nextLine();
        ft.setNumero(numero);
        System.out.println("Digite a descricao: ");
        String descricao = sc.nextLine();
        ft.setDescricao(descricao);
        System.out.println("Digite a quantidade comprada de um item: ");
        int quantCompradaItem = sc.nextInt();
        ft.setQuantCompradaItem(quantCompradaItem);
        System.out.println("Digite o preco do item: ");
        double PrecoPorItem = sc.nextDouble();
        ft.setPrecoPorItem(PrecoPorItem);
        //nao ta pronto, n entendi a parte do 0 e 0.0
        System.out.println("Valor total  da fatura: " + ft.getTotalFatura());
    }

}