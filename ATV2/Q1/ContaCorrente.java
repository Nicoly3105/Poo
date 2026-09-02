package ATV2.Q1;

public class ContaCorrente extends ContaBancaria  {
    double chequeEspecial;
    public ContaCorrente(String cliente, String agencia, String conta, double saldo, double chequeEspecial) {
        super(cliente, agencia, conta, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    @Override
    public void sacar(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo = saldo - valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo e cheque especial insuficientes.");
        }
    }
}
