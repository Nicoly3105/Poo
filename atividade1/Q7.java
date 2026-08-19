package atividade1;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diga o número que deseja ver a tabuada: ");
        int num = input.nextInt();
        for(int i = 1; i< 11; i++){
        System.out.println(num+ " x "+ i + " = " + num*i);
        }
    }
}
