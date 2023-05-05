package application;

import classes.Pessoa;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pe1 = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa pe2 = new Pessoa("Isaac Newton", 4, 1, 1643);
        
        pe1.calculaIdade(19, 4, 2023);
        System.out.println("Idade de Albert Einstein: " + pe1.informaIdade());
        pe2.calculaIdade(19, 4, 2023);
        System.out.println("Idade de Isaac Newton: " + pe2.informaIdade());
        
        System.out.println("\n" + (pe1.toString()));
        System.out.println("\n" + (pe2.toString()));
    }
}