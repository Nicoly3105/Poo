package atividade1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = input.nextLine();
        System.out.print("Qual a sua idade? ");
        int idade = input.nextInt();
        System.out.println("Bem-vindo(a) " + nome + "! sua idade é " + idade);

    }
}
