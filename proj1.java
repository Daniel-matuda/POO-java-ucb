import java.util.Scanner;
public class Proj1 {
 
    public static void main(String[] args) {
        
        String pet;
        String raca;
        int idade;
        float peso;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do seu Pet? ");
        pet = sc.nextLine();
        System.out.println("Qual a raca dele? ");
        raca = sc.nextLine();
        System.out.println("Quantos anos ele tem?");
        idade = sc.nextInt();
        System.out.println("Qual o peso dele? ");
        peso  = sc.nextFloat();
    }
}