package TratamentoDeErros;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            System.out.println("\n1-Adicionar 2-Remover 3-Acessar 0-Sair");
            String comando = sc.nextLine();

            try {
                switch (comando) {
                    case "1":
                        System.out.print("Nome: ");
                        nomes.add(sc.nextLine());
                        break;

                    case "2":
                        System.out.print("Indice para remover: ");
                        int remover = Integer.parseInt(sc.nextLine());
                        System.out.println("Removido: " +
                                nomes.remove(remover));
                        break;

                    case "3":
                        System.out.print("Indice para acessar: ");
                        int indice = Integer.parseInt(sc.nextLine());
                        System.out.println(nomes.get(indice));
                        break;

                    case "0":
                        sc.close();
                        return;

                    default:
                        throw new IllegalArgumentException();
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: indice invalido.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um indice inteiro.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: comando invalido.");
            }
        }
    }
}