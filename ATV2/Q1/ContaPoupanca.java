package ATV2.Q1;

public class ContaPoupanca extends ContaBancaria {
    double taxaRendimento;
    public ContaPoupanca(String cliente, String agencia, String conta, double saldo, double taxaRendimento) {
        super(cliente, agencia, conta, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento / 100;
        saldo = saldo + rendimento;
        System.out.println("Rendimento aplicado!");
    }
}
