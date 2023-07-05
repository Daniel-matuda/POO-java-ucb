package application3;

import classes3.Operario;

public class OperarioTeste {

    public static void main(String[] args) {
        Operario op = new Operario("Nelly", "Rua Furtado", "45 993214568", 32, 7500.0, 10.0, 40000.0, 5.0);
        
        System.out.println("\nSalario base: " + op.getSalarioBase()
                + "\nValor monetario dos artigos efetivamente produzidos pelo operario: " + op.getValorProducao()
                + "\nComissao: " + op.getComissao()
                + "\nSalario com comissao: " + op.calcularSalario());

        op.setValorProducao(10000.0);
        op.setComissao(10);

        System.out.println("\nSalario base: " + op.getSalarioBase()
                + "\nValor monetario atualizado dos artigos efetivamente produzidos pelo operario: " + op.getValorProducao()
                + "\nComissao atualizada: " + op.getComissao()
                + "\nSalario com comissao atualizado: " + op.calcularSalario());

    }

}
