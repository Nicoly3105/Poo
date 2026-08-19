package atividade1;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        double calculo = peso/(altura*altura);
        if(calculo <18.5){
            System.out.println("Vc está abaixo do peso.");
        }else if(calculo < 25){
            System.out.println("Vc está com peso normal");
        }else if(calculo < 30){
            System.out.println("Vc está com sobrepeso");
        }else{
            System.out.println("Vc está obeso");
        }

    }
}
