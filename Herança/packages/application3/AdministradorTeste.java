package application3;

import classes3.Administrador;

public class AdministradorTeste {

    public static void main(String[] args) {
        Administrador ad = new Administrador("Eminem", "Avenida Missouri", "11 996544895", 45, 12500.0, 40.0, 2000.0);

        System.out.println("\nSalario base: " + ad.getSalarioBase()
                + "\nAjudas referentes a viagens, estadias...: " + ad.getAjudaDeCusto()
                + "\nSalario com ajudas: " + ad.calcularSalario());

        ad.setAjudaDeCusto(1000.0);

        System.out.println("\nSalario base: " + ad.getSalarioBase()
                + "\nAjudas referentes a viagens, estadias... atualizadas: " + ad.getAjudaDeCusto()
                + "\nSalario com ajudas atualiado: " + ad.calcularSalario());

    }

}
