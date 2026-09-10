package ATV3.Q6;

import java.util.Scanner;

public class ReferenciaNula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite -1 para encerrar o programa e 0 para continuar: ");
                int opcao = input.nextInt();
                if (opcao == -1) {
                    System.out.println("Programa encerrado!");
                    break;
                }
                else if (opcao == 0) {
                    String texto = null;
                    System.out.println("Tentando verificar o tamanho do texto...");
                    int tamanho = texto.length();
                    System.out.println("Tamanho: " + tamanho);
                }
            } catch (NullPointerException e) {
                System.out.println("O valor não foi definido. Erro: " +e.getMessage());
            }
        }
    }
}

