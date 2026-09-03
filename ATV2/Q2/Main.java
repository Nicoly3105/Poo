package ATV2.Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura atual: ");
        double atual = sc.nextDouble();
        System.out.print("Digite a temperatura desejada: ");
        double desejada = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o modo  que deseja (Resfriar, Aquecer ou Desligado): ");
        String modo = sc.nextLine();
        Termostato termostato = new Termostato(atual, desejada, modo);
        termostato.executarCiclo();
        sc.close();
    }
}
