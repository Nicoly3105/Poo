import java.util.InputMismatchException;
import java.util.Scanner;

public class Apperros {
    static void main(){
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int opcao;

        String menu = "Digite -1 para sair ou 0 para continuar";

        while(true){
            try{
            System.out.println(menu);
            opcao = input.nextInt();
            if (opcao == -1){
                break;
            }
            System.out.println("Digite o primeiro número: ");
            num1 = input.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = input.nextInt();

    System.out.println("Resultado: " + (num1/num2));
    }catch(InputMismatchException e){
        System.out.println("Digite um número inteiro positivo.");
        input.next();
    }catch(ArithmeticException e){
        System.out.println("Não é possível dividir um número por 0.");
        input.next();
    }
    
        }
        }
}
