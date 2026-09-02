package ATV2.Q3;

public class Vendedor extends CLT {
    public Vendedor(String nome, String cpf, double salarioBase,
                    double aliquotaBonus, double totalVendas) {
        super(nome, cpf, salarioBase, aliquotaBonus, totalVendas);
    }
    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * 1 / 100);
    }
}
