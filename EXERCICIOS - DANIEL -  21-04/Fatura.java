package classes;

public class Fatura {

    private String numero;
    private String descricao;
    private int quantCompradaItem;
    private double precoPorItem;

    public Fatura() {

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantCompradaItem() {
        return quantCompradaItem;
    }

    public void setQuantCompradaItem(int quantCompradaItem) {
        this.quantCompradaItem = quantCompradaItem;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura() {
        if (precoPorItem < 0) {
            precoPorItem = 0.0;
        }
        double valor = quantCompradaItem * precoPorItem;
        if (valor < 0) {
            valor = 0;
        }
        return valor;
    }
}