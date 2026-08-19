package atividade1;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("""
            Qual tipo de combustível vc deseja? 
            [G]Gasolina
            [A]Alcool
                """);
        char escolha = input.next().toUpperCase().charAt(0);
        System.out.println("Quantos litros? ");
        int lit = input.nextInt();
        if(escolha == 'G'){
            double valor = lit*5.5;
            System.out.println("Vc vai pagar " + valor + " reais nessa quantia de gasosa");
        }else if(escolha == 'A'){
            double valor = lit*4;
            System.out.println("Vc vai pagar "+ valor + " reais nessa quantia de alcu");
        }

    }
}
