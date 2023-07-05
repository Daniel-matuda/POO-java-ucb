package classes2;

import classes2.Empregado;

public class Gerente extends Empregado {

    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia() {
        this.nomeGerencia = nomeGerencia;
    }
    
    @Override
    public String toString() {
        return "\nDados do gerente: "
                + "\nNome: "
                + super.getNome()
                + "\nIdade: "
                + super.getIdade()
                + "\nMatricula: "
                + super.getMatricula()
                + "\nNome da gerencia: "
                + getNomeGerencia()
                + "\nValor do INSS: "
                + super.getvalorINSS();
    }
}
