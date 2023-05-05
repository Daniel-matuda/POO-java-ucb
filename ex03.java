package ListaAula;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        char olhos, cabelos, sexo;
        double salario;
        int countParticipantes = 0;
        int caracteristicas = 0;
        System.out.println("Informe a Idade:");
        idade = sc.nextInt();
        while (idade != -1) {
            if (idade < 10 || idade > 100) {
                System.out.println("Idade inválida! Digite novamente.");
                System.out.println("Informe a Idade: ");
                idade = sc.nextInt();
                continue;
            }
            sc.nextLine();
            System.out.println("Digite o Sexo:");
            sexo = sc.nextLine().charAt(0);
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Digite novamente.");
                System.out.println("Informe o Sexo: ");
                sexo = sc.nextLine().charAt(0);
                continue;
            }
            System.out.println("Digite o salario: ");
            salario = sc.nextDouble();
            if (salario < 0) {
                System.out.println("Digite novamente: ");
                System.out.println("Informe o salario: ");
                salario = sc.nextDouble();
                continue;
            }
            sc.nextLine(); // Consome a quebra de linha pendente
            System.out.println("cor dos olhos: A para azuis  V para verde  C castanho  P-preto");
            olhos = sc.nextLine().charAt(0);
            if (olhos != 'a' && olhos != 'v' && olhos != 'c' && olhos != 'p') {
                System.out.println("Digite novamente.");
                System.out.println("Informe a cor dos olhos: A para azuis V para verde C para castanho P para preto: ");
                olhos = sc.nextLine().charAt(0);
                continue;
            }
            System.out.println("Cor do cabelo: L para loiros  C para castanhos  R para ruivos P para pretos: ");
            cabelos = sc.nextLine().charAt(0);
            if (cabelos != 'l' && cabelos != 'c' && cabelos != 'p' && cabelos != 'r') {
                System.out.println("Digite novamente: ");
                System.out.println("Cor do cabelo L para loiros C para castanhos R para ruivos P para pretos): ");
                cabelos = sc.nextLine().charAt(0);
                continue;
            }
            countParticipantes++;
            if (sexo == 'f' && idade >= 18 && idade <= 35 && olhos == 'c' && cabelos == 'c') {
                caracteristicas++;
            }
            System.out.println("Digite a Idade: ");
            idade = sc.nextInt();
        }
        double porcentagem = (caracteristicas / countParticipantes) * 100;
        System.out.println("% de mulheres com cabelos e olhos castanhos de 18 e 35 anos: " + porcentagem + "%");
    }
}
