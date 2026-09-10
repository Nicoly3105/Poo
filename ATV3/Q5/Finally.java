package ATV3.Q5;
import java.util.Scanner;

public class Finally {
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
                    System.out.println("Abrindo arquivo...");
                    System.out.println("Digite um número: ");
                    String texto = input.next();
                    int numero = Integer.parseInt(texto);
                    System.out.println("Número lido: " + numero);
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite somente números. Erro: " + e.getMessage());
            } finally {
                System.out.println("Arquivo fechado.");
            }
        }
    }
}
