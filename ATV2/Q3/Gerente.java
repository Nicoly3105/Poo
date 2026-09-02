package ATV2.Q3;

public class Gerente extends CLT {
    public Gerente(String nome, String cpf, double salarioBase,double aliquotaBonus, double totalVendas) {
        super(nome, cpf, salarioBase, aliquotaBonus, totalVendas);
    }
    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * 0.5 / 100);
    }
}