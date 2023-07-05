package application3;

import classes3.Vendedor;

public class VendedorTeste {

    public static void main(String[] args) {
        Vendedor ve = new Vendedor("Dre", "Rua Doutor", "85 980085532", 420, 15250.0, 15.0, 80000.0, 2.0);
        
        System.out.println("\nSalario base: " + ve.getSalarioBase()
                + "\nValor monetario dos artigos vendidos: " + ve.getValorVendas()
                + "\nComissao: " + ve.getComissao()
                + "\nSalario com comissao: " + ve.calcularSalario());

        ve.setValorVendas(50000.0);
        ve.setComissao(3);

        System.out.println("\nSalario base: " + ve.getSalarioBase()
                + "\nValor monetario atualizado dos artigos vendidos: " + ve.getValorVendas()
                + "\nComissao atualizada: " + ve.getComissao()
                + "\nSalario com comissao atualizado: " + ve.calcularSalario());

    }

}
