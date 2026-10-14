package TratamentoDeErros;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        try {
            System.out.print("Digite a linha (0 ou 1): ");
            int linha = Integer.parseInt(sc.nextLine());

            System.out.print("Digite a coluna (0 a 2): ");
            int coluna = Integer.parseInt(sc.nextLine());

            System.out.println("Elemento: " + matriz[linha][coluna]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: linha ou coluna invalida.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite numeros inteiros.");
        }

        sc.close();
    }
}    

