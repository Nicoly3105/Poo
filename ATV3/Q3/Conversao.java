package ATV3.Q3;
import java.lang.classfile.constantpool.IntegerEntry;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Conversao {
    public static void main(String[] args) {
        int opcao;
        Scanner input = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Digite -1 para encerrar o programa e 0 para continuar: ");
                opcao = input.nextInt();
                if (opcao == -1){
                    System.out.println("Programa encerrado!");
                    break;
                }
                else if (opcao == 0){
                    System.out.println("Digite sua idade: ");
                    String idade = input.next();
                    int idade_convertida = Integer.parseInt(idade);
                }
            }catch(NumberFormatException e){
                System.out.println("Digite somente números para sua idade. Erro: "+e.getMessage());
            }
        }
    }
}
