package ATV3.Q8;

public class ContaBancaria {
    private double saldo;
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor)
            throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo = saldo - valor;
        System.out.println("Saque realizado com sucesso!");
    }
    public double getSaldo() {
        return saldo;
    }
}
