package atividade1;

import java.util.Locale;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int opcao;
        int quantidadeAnimais = 0;
        double maior = 0;
        double menor = 0;

        do {
        System.out.print("""
            \n
            1. Cadastrar Peso
            2. Finalizar

            - Digite a opção que deseja realizar:   """);
        opcao = input.nextInt();

        if (opcao == 1){
            System.out.print("\nInforme o peso do animal:  ");
            double peso = input.nextDouble();
            quantidadeAnimais++;
            System.out.println("\nAnimal cadastrado com sucesso!");

            if(quantidadeAnimais == 1){
            maior = peso;
            menor = peso;
            }

            if(peso >= maior){
            maior = peso;
            }

            if(peso <= menor){
            menor = peso;
            }
        } else if (opcao == 2){
            System.out.println("\nFinalizando programa...\n");
        } else{
            System.out.println("\nOpção inválida\n");
        }

        } while(opcao != 2);

        System.out.println("Quantidade de animais registrados:  " + quantidadeAnimais);
        if (quantidadeAnimais > 0) {
            System.out.println("Maior peso registrado:  " + maior);
            System.out.println("Menor peso registrado:  " + menor);
        } else {
            System.out.println("Nenhum animal foi registrado.");
        }


    }
}
