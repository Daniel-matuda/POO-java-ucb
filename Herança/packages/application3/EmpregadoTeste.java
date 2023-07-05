package application3;

import classes3.Empregado;

public class EmpregadoTeste {

    public static void main(String[] args) {
        //teste da classe Empregado
        Empregado em = new Empregado("Marcela", "Avenida Marechal 24", "61 998671234", 12, 3450.0, 25);
        
        System.out.println("\nCodigo do setor: " + em.getCodigoSetor()
                + "\nSalario base: " + em.getSalarioBase()
                + "\nPorcentagem retida dos impostos: " + em.getImposto()
                + "\nSalario final: " + em.calcularSalario());
        
        em.setCodigoSetor(15);
        em.setSalarioBase(3670.0);
        em.setImposto(20);
        
        System.out.println("\nCodigo do setor atualizado: " + em.getCodigoSetor()
                + "\nSalario base atualizado: " + em.getSalarioBase()
                + "\nPorcentagem retida dos impostos atualizado: " + em.getImposto()
                + "\nSalario final atualizado: " + em.calcularSalario());
    }

}
