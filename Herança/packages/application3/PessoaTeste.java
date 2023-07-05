package application3;

import classes3.Pessoa;
import classes3.Fornecedor;

public class PessoaTeste {

    public static void main(String[] args) {
        //teste da classe Pessoa e Fornecedor
        Pessoa pe = new Pessoa("Antonio", "Rua Pinheiros 23", "11 998542323");
        Fornecedor fo = new Fornecedor("Bico de Ouro", "Rua dos Mangabas", "11 33296578", 56000.0, 12533.70);

        //teste Pessoa
        System.out.println("\nNome: " + pe.getNome()
                + "\nEndereco: " + pe.getEndereco()
                + "\nTelefone: " + pe.getTelefone());

        pe.setNome("Murilo");
        pe.setEndereco("Avenida dos Bois");
        pe.setTelefone("64 999652332");

        System.out.println("\nNome atualizado: " + pe.getNome()
                + "\nEndereco atualizado: " + pe.getEndereco()
                + "\nTelefone atualizado: " + pe.getTelefone());

        //teste Fornecedor
        System.out.println("\nValor do credito maximo atribuido ao fornecedor: "
                + fo.getValorCredito()
                + "\nValor da divida para com o fornecedor: "
                + fo.getValorDivida()
                + "\nDiferenca entre entre o credito e a divida: "
                + fo.obterSaldo());
        
        fo.setValorCredito(65000.0);
        fo.setValorDivida(35468.89);
        
        System.out.println("\nValor atualizado do credito maximo atribuido ao fornecedor: "
                + fo.getValorCredito()
                + "\nValor atualizado da divida para com o fornecedor: "
                + fo.getValorDivida()
                + "\nDiferenca atualizada entre o credito e a divida: "
                + fo.obterSaldo());;
    }

}
