package ATV3.Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(500);
        while (true) {
            try {
                System.out.println("Digite -1 para encerrar o programa e 0 para continuar: ");
                int opcao = input.nextInt();
                if (opcao == -1) {
                    System.out.println("Programa encerrado!");
                    break;
                }
                else if (opcao == 0) {
                    System.out.println("Saldo atual: R$ "+ conta.getSaldo());
                    System.out.println("Digite o valor do saque: ");
                    String valor = input.next();
                    double valorConvertido = Double.parseDouble(valor);
                    conta.sacar(valorConvertido);
                    System.out.println("Saldo atual: R$ "+ conta.getSaldo());
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Digite somente números. Erro: "+ e.getMessage());
            } catch (SaldoInsuficienteException e) {
                System.out.println(
                        "Erro: " + e.getMessage());
                System.out.println(
                        "Saldo atual: R$ " + conta.getSaldo());
            }
        }
    }
}
