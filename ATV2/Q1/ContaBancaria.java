package ATV2.Q1;

public class ContaBancaria {
    String cliente;
    String agencia;
    String conta;
    double saldo;

    public ContaBancaria(String cliente, String agencia, String conta, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

}