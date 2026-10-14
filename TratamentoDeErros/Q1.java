package TratamentoDeErros;

import java.util.Scanner;

public class Q1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero: ");
            int n1 = sc.nextInt();

            System.out.print("Digite o segundo numero: ");
            int n2 = sc.nextInt();

            int resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: nao pode dividir por zero.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: digite apenas numeros inteiros.");
        }

        sc.close();
    }
}
