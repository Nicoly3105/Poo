package atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("VALIDAÇÃO DE SENHA\n");
        do {
        System.out.print("\nDigite uma senha: ");
        String senha = input.next();

        int numero = 0;
        int maiuscula = 0;

        for (int i = 0; i < senha.length(); i++) {
            char letra = senha.charAt(i);

            if (Character.isDigit(letra)) {
            numero++;
            }

            if (Character.isUpperCase(letra)) {
            maiuscula++;
            }
        }

        if (senha.length() < 8) {
            System.out.println("A senha deve ter no mínimo 8 CARACTERES.");
        }

        if (numero == 0) {
            System.out.println("A senha deve conter pelo menos 1 NÚMERO.");
        }

        if (maiuscula == 0) {
            System.out.println("A senha deve conter pelo menos 1 letra MAIÚSCULA.");
        }

        if (senha.length() >= 8 && numero > 0 && maiuscula > 0) {
            System.out.println("Senha cadastrada com sucesso!");
            break;
        }

        } while (true);
    

    }
}
