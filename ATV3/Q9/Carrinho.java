package ATV3.Q9;

import java.util.Scanner;

public class Carrinho {
    
    public static void adicionarItem(
        String nome,
        int quantidade,
        double preco) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero." );
        }
        if (preco < 0) {
            throw new ArithmeticException("O preço não pode ser negativo.");
        }
        System.out.println("Item adicionado!");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite -1 para encerrar o programa e 0 para continuar: ");
                int opcao = input.nextInt();
                if (opcao == -1) {
                    System.out.println("Programa encerrado!");
                    break;
                }
                else if (opcao == 0) {
                    System.out.println("Digite o nome do produto: ");
                    String nome = input.next();
                    System.out.println("Digite a quantidade: ");
                    String quantidade = input.next();
                    int quantidadeConvertida = Integer.parseInt(quantidade);
                    System.out.println("Digite o preço: ");
                    String preco = input.next();
                    double precoConvertido =
                            Double.parseDouble(preco);
                    adicionarItem(nome,quantidadeConvertida,precoConvertido);
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Digite somente números. Erro: "+ e.getMessage()
                );
            } catch (IllegalArgumentException e) {
                System.out.println(
                        "Erro na quantidade: "+ e.getMessage()
                );
            } catch (ArithmeticException e) {
                System.out.println(
                        "Erro no preço: "+ e.getMessage()
                );
            }
        }
    }
}

