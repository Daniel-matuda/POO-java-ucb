package applications;

import classes.CarroPasseio;
import classes.Caminhao;

public class TesteMotor {
    public static void main(String[] args) {
        CarroPasseio carroPasseio = new CarroPasseio();
        carroPasseio.insertData();
        System.out.println();
        carroPasseio.print();

        System.out.println();

        Caminhao caminhao = new Caminhao();
        caminhao.insertData();
        System.out.println();
        caminhao.print();
    }
}
