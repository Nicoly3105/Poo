package TratamentoDeErros;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Primeiro numero: ");
            double n1 = Double.parseDouble(sc.nextLine());

            System.out.print("Operacao (+, -, *, /): ");
            String op = sc.nextLine();

            System.out.print("Segundo numero: ");
            double n2 = Double.parseDouble(sc.nextLine());

            switch (op) {
                case "+":
                    System.out.println(n1 + n2);
                    break;
                case "-":
                    System.out.println(n1 - n2);
                    break;
                case "*":
                    System.out.println(n1 * n2);
                    break;
                case "/":
                    if (n2 == 0) {
                        throw new ArithmeticException();
                    }
                    System.out.println(n1 / n2);
                    break;
                default:
                    throw new IllegalArgumentException();
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: numero invalido.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisao por zero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: operacao invalida.");
        }

        sc.close();
    }  
}
