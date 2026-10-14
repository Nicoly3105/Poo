package TratamentoDeErros;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o telefone (9 digitos): ");
        String telefone = sc.nextLine();

        try {
            if (telefone.length() != 9) {
                throw new IllegalArgumentException(
                        "O telefone deve ter 9 digitos.");
            }

            for (int i = 0; i < telefone.length(); i++) {
                if (!Character.isDigit(telefone.charAt(i))) {
                    throw new IllegalArgumentException(
                            "Use apenas digitos numericos.");
                }
            }

            System.out.println("Telefone valido.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}    

