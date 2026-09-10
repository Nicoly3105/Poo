package ATV3.Q2;

import java.util.Scanner;

public class AcessoSeguro {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    int opcao;
    int indice;
    String[] nomes = new String[]{"Nick","Kamis","Larao","clarao"};
    System.out.print("Digite 0 para ver os índices ou -1 para encerrar: ");
    opcao = input.nextInt();
    while(true){
        try{
            if(opcao == -1){
                System.out.println("Encerrando o programa!");
                break;
            }
            else if(opcao == 0){
                System.out.println("Digite o índice que deseja ver na lista: ");
                indice = input.nextInt();
                System.out.println(nomes[indice]);

            }
        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Posição Inválida. Erro: " + e.getMessage());
        }
    }
    }
}
