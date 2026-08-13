import java.util.Scanner;
public class atv1{
    public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      System.out.print("Qual o primeiro número que vc deseja usar? ");
      int n1 = input.nextInt();

      System.out.println("Escola qual operação vc pretende usar: ");
      System.out.print("""
         1 - Soma
         2 - Subtração
         3 - Multiplicação
         4 - Divisão
            """);
      int escolha = input.nextInt();

      System.out.print("Qual o segundo número que vc deseja usar? ");
      int n2 = input.nextInt();

      switch (escolha) {
         case 1:
            System.out.println(n1 + " + " +n2+ " = " + (n1+n2));break;
         case 2:
            System.out.println(n1 + " - " +n2+ " = " + (n1-n2));break;
         case 3:
            System.out.println(n1 + " x " +n2+ " = " + (n1*n2));break;
         case 4:
            System.out.println(n1 + " : " +n2+ " = " + (n1/n2));break;
         default:
            System.out.println("Opção inválida!");
            break;
      }

      }
   }
