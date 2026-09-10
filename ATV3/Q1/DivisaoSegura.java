package ATV3.Q1;

import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int opcao;
        Scanner input = new Scanner(System.in);
        System.out.println("~Divisão segura~");

        while(true){
            try{
                System.out.println("Digite -1 para encerrar e 0 para continuar: ");
                opcao = input.nextInt();
                if(opcao == -1){
                    System.out.println("Programa encerrado!");
                    break;
                }
                
                else if(opcao == 0){
                    System.out.println("Digite seu primeiro valor: ");
                    num1 = input.nextInt();
                    System.out.println("Digite seu segundo valor: ");
                    num2 = input.nextInt();
            System.out.println("Resultado de " +num1+ "/"+num2+" = "+ (num1/num2));
                }
            }catch(ArithmeticException e){
                System.out.println("Não é possíve dividir um valor por 0. Erro: " + e.getMessage());
            }
        }
    }
}
