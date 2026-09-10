package ATV3.Q4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplosCatches {
    public static void main(String[] args) {
        String txt1;
        String txt2;
        int opcao;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 0 para continuar e -1 para encerrar o programa:  ");
        opcao = input.nextInt();
        while(true){
            try{
                if (opcao == -1){
                    System.out.println("Programa encerrado!");
                    break;
                }
                else if (opcao == 0){
                    System.out.println("Digite um valor númerico: ");
                    txt1 = input.next();
                    int txt1_convertido = Integer.parseInt(txt1);
                    System.out.println("Digite outro valor númerico: ");
                    txt2 = input.next();
                    int txt2_convertido = Integer.parseInt(txt2);
                    System.out.println("Resultado: " + (txt1_convertido/txt2_convertido));
                }
            }catch(ArithmeticException e){
                System.out.println("Não é posssível fazer nenhuma divisão por 0. Erro: " +e.getMessage());
            }catch(NumberFormatException e){
                System.out.println("O valor não é númerico! Erro: " +e.getMessage());
            }
        }
    }
}
