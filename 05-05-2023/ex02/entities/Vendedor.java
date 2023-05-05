package entities;

public class Vendedor extends Empregado {
    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, int qntVendas, double valorVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }
    public double getValorVendas() {
        return valorVendas;
    }
    public int getQntVendas() {
        return qntVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
    @Override
    public String toString(){
        return """
               \nVendedor
               Nome: """ + getNome()
                +"\nSalario: " + getSalario ()
                +"\nValor das Vendas: " + valorVendas
                +"\nQuantidade de Vendas: " + qntVendas;
    }
}