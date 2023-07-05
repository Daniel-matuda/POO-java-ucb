package applications;

import classes.Empresa;
import classes.Restaurante;

public class TesteEmpresa {
    public static void main(String[] args) {
        Restaurante re = new Restaurante();
        re.insertData();
        System.out.println();
        re.print();
    }
}
