package TratamentoDeErros;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um inteiro ou sair: ");
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int numero = Integer.parseInt(texto);
                System.out.println("Numero digitado: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada invalida.");
            }
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
