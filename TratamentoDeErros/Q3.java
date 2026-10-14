package TratamentoDeErros;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.print("Digite o indice (0 a 4): ");
            int indice = sc.nextInt();

            System.out.println("Elemento: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: indice invalido.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: digite um indice inteiro.");
        }

        sc.close();
    }
}
