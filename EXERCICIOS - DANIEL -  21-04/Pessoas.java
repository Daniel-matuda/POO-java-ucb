package classes;

public class Pessoa {

    private int idade;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private String nome;

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - anoNasc;
        if (mesAtual < mesNasc) {
            idade--;
        } else if (mesAtual == mesNasc && diaAtual < diaNasc) {
            idade--;
        }
    }

    public int informaIdade() {
        return idade;
    }

    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nData de nascimento: " + diaNasc + "/" + mesNasc + "/" + anoNasc;
    }

    public void ajustaDatadeNascimento(int diaNasc, int mesNasc, int anoNasc) {
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }
    
    public Pessoa(String nome, int diaNasc, int mesNasc, int anoNasc) {
        this.nome = nome;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }
}