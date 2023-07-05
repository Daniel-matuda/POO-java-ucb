package applications;

import classes.Funcionario;
import classes.Gerente;
import classes.Pessoa;

public class Main {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Pedro", 1500, 300);
        
        System.out.println(f1.toString());
        
        Gerente g1 = new Gerente("Maria", 2500, 300, 1000);
        
        System.out.println(g1.toString());
    }
    
}

