package atividade1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o seu primeiro número?");
        int num1 = input.nextInt();
        
        System.out.print("Qual o seu segundo número?");
        int num2 = input.nextInt();

        System.out.print("Qual o seu terceiro número?");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 >num3){
            System.out.println("O maior número é: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("O maior número é: " + num2);
        }else if(num3 > num1 && num3 > num2){
            System.out.println("O maior número é: " + num3);
        }else{
            System.out.println("Os números são iguais");
        }

    }

}
