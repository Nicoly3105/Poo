package ATV3.Q10;

import java.util.Scanner;

public class App {
    public static double dividir(double numero1, double numero2)
            throws DivisaoPorZeroException {
        if (numero2 == 0) {
            throw new DivisaoPorZeroException(
                    "Não é possível dividir por zero."
            );
        }
        return numero1 / numero2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(
                        "Digite -1 para encerrar o programa e 0 para continuar: "
                );
                int opcaoInicial = input.nextInt();
                if (opcaoInicial == -1) {
                    System.out.println("Programa encerrado!");
                    break;
                }
                else if (opcaoInicial == 0) {
                    System.out.println("=== CALCULADORA ===");
                    System.out.println("1 - Somar");
                    System.out.println("2 - Subtrair");
                    System.out.println("3 - Multiplicar");
                    System.out.println("4 - Dividir");
                    System.out.println("Escolha uma opção: ");
                    int opcao = input.nextInt();
                    if (opcao < 1 || opcao > 4) {
                        System.out.println(
                                "Opção inválida."
                        );
                        continue;
                    }
                    System.out.println("Digite o primeiro número: ");
                    String numero1 = input.next();
                    double numero1Convertido =
                            Double.parseDouble(numero1);
                    System.out.println("Digite o segundo número: ");
                    String numero2 = input.next();
                    double numero2Convertido =
                            Double.parseDouble(numero2);
                    double resultado = 0;
                    if (opcao == 1) {
                        resultado =
                                numero1Convertido + numero2Convertido;
                    }
                    else if (opcao == 2) {
                        resultado =
                                numero1Convertido - numero2Convertido;
                    }
                    else if (opcao == 3) {
                        resultado =
                                numero1Convertido * numero2Convertido;
                    }
                    else if (opcao == 4) {
                        resultado = dividir(
                                numero1Convertido,
                                numero2Convertido
                        );
                    }
                    System.out.println(
                            "Resultado: " + resultado
                    );
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Digite somente números. Erro: "
                                + e.getMessage()
                );
            } catch (DivisaoPorZeroException e) {
                System.out.println(
                        "Erro: " + e.getMessage()
                );
            } finally {
                System.out.println(
                        "Operação concluída."
                );
            }
        }
    }
}
