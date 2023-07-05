package application;

import classes.Animal;
import classes.Peixe;
import classes.Cachorro;

public class AnimalTeste {

    public static void main(String[] args) {
        
        Animal an = new Animal("Mimosa", 357.5);
        Peixe pe = new Peixe("Dourado", 5.0, "Agua doce");
        Cachorro ca = new Cachorro("Bob", 12.3, "Chow Chow");
        
        System.out.println("Dados do animal: \n" + an.toString());
        System.out.println("\nDados do peixe: \n" + pe.toString());
        System.out.println("\nDados do animal: \n" + ca.toString());
    }
    
}
