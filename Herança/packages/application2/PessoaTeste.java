package application2;

import classes2.Cliente;
import classes2.Pessoa;
import classes2.Empregado;
import classes2.Gerente;
import classes2.Vendedor;

public class PessoaTeste {

    public static void main(String[] args) {

        Cliente cl = new Cliente("Juliana", 45, "Feminino", 3523.65, 1978);
        Gerente ge = new Gerente("Marcos", 21, "Masculino", 2000.0, "123456", "Gerente de Projetos");
        Vendedor ve = new Vendedor("Jorge", 30, "Masculino", 3400.0, "456789", 45500.0, 120);

        System.out.println(cl.toString());
        System.out.println(ge.toString());
        System.out.println(ve.toString());
    }
}
