package ATV2.Q1;

public class Main {
    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente(
            "Nick",
            "001",
            "12345",
            1000,
            500
        );

        corrente.depositar(200);
        corrente.sacar(1400);
        System.out.println("Saldo: " + corrente.saldo);

        ContaPoupanca poupanca = new ContaPoupanca(
            "Lara",
            "002",
            "54321",
            1000,
            5
        );

        poupanca.aplicarRendimento();
        System.out.println("Saldo: " + poupanca.saldo);
    }
}
