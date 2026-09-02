package ATV2.Q3;

public class CLT {
    String nome;
    String cpf;
    double salarioBase;
    double aliquotaBonus;
    double totalVendas;

    public CLT(String nome, String cpf, double salarioBase,double aliquotaBonus, double totalVendas) {

        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.aliquotaBonus = aliquotaBonus;
        this.totalVendas = totalVendas;
    }
    public double calcularSalario() {
        return salarioBase + (totalVendas * aliquotaBonus / 100);
    }
}
