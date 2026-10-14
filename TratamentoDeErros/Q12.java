package TratamentoDeErros;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF (somente numeros): ");
        String cpf = sc.nextLine();

        try {
            if (cpf.length() != 11) {
                throw new IllegalArgumentException(
                        "O CPF deve ter 11 digitos.");
            }

            for (int i = 0; i < cpf.length(); i++) {
                if (!Character.isDigit(cpf.charAt(i))) {
                    throw new IllegalArgumentException(
                            "O CPF deve conter apenas numeros.");
                }
            }

            System.out.println("Formato do CPF valido.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}    

