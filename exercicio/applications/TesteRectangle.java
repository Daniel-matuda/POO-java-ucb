//1. Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1. 
//Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get 
//para o comprimento (length) e a largura (width). Os métodos set devem verificar se length e width 
//são, cada um, números de ponto flutuante maiores que 0,0 e menores que 20,0. Escreva um programa 
//para testar a classe Rectangle.

package applications;

import classes.Rectangle;

public class TesteRectangle {

    public static void main(String[] args) {
        Rectangle re = new Rectangle ();
        re.setLength(5.5);
        re.setWidth(6.0);
        System.out.println("Comprimento: " + re.getLength());
        System.out.println("Largura: " + re.getWidth());
        System.out.println("Perimetro: " + re.calcularPerimetro());
        System.out.println("Area: " + re.calcularArea());
        
    }
    
}
