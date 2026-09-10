package ATV3.Q7;

import java.util.Scanner;

public class Main {
    public static void cadastrarIdade(int idade)
            throws IdadeInvalidaException {
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("A idade deve estar entre 0 e 120.");
        }
        System.out.println("Idade cadastrada com sucesso!");
    }
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
                    System.out.println("Digite sua idade: ");
                    String idade = input.next();
                    int idadeConvertida = Integer.parseInt(idade);
                    cadastrarIdade(idadeConvertida);
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Digite somente números. Erro: " + e.getMessage()
                );
            } catch (IdadeInvalidaException e) {
                System.out.println(
                        "Erro: " + e.getMessage()
                );
            }
        }
    }
}

