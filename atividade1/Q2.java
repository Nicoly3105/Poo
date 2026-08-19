package atividade1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Me diga um número: ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("Seu número é par!");
        }else{
            System.out.println("Seu número é ímpar!");
        }

    }
}
