package AtvSTREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

enum TipoServico {
    ELETRICO,
    HIDRAULICO,
    ALVENARIA
}

class Servico {
    TipoServico tipo;
    double valor;

    Servico(TipoServico tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
}

class Autonomo {
    String nome;
    String cpf;
    List<Servico> servicos;

    Autonomo(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.servicos = new ArrayList<>();
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Autonomo> autonomos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar autonomo");
            System.out.println("2 - Cadastrar servico");
            System.out.println("3 - Consultar servicos por CPF");
            System.out.println("4 - Agrupar servicos por tipo");
            System.out.println("5 - Somar servicos de um autonomo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("CPF: ");
                    String cpf = entrada.nextLine();

                    autonomos.add(new Autonomo(nome, cpf));
                    System.out.println("Autonomo cadastrado!");
                    break;

                case 2:
                    System.out.print("CPF do autonomo: ");
                    String cpfBusca = entrada.nextLine();

                    Autonomo encontrado = autonomos.stream()
                            .filter(a -> a.cpf.equals(cpfBusca))
                            .findFirst()
                            .orElse(null);

                    if (encontrado == null) {
                        System.out.println("Autonomo nao encontrado.");
                        break;
                    }

                    System.out.println("Tipos: ELETRICO, HIDRAULICO, ALVENARIA");
                    System.out.print("Tipo do servico: ");
                    String tipoTexto = entrada.nextLine().toUpperCase();

                    TipoServico tipo = TipoServico.valueOf(tipoTexto);

                    System.out.print("Valor: ");
                    double valor = Double.parseDouble(entrada.nextLine());

                    encontrado.servicos.add(new Servico(tipo, valor));
                    System.out.println("Servico cadastrado!");
                    break;

                case 3:
                    System.out.print("CPF para consulta: ");
                    String cpfConsulta = entrada.nextLine();

                    autonomos.stream()
                            .filter(a -> a.cpf.equals(cpfConsulta))
                            .forEach(a -> {
                                System.out.println("Nome: " + a.nome);

                                a.servicos.stream()
                                        .forEach(s -> System.out.println(
                                            s.tipo + " - R$ " + s.valor
                                        ));
                            });
                    break;

                case 4:
                    Map<TipoServico, List<Servico>> grupos =
                        autonomos.stream()
                            .flatMap(a -> a.servicos.stream())
                            .collect(Collectors.groupingBy(s -> s.tipo));

                    grupos.forEach((tipoServico, lista) -> {
                        System.out.println(tipoServico + ": "
                            + lista.size() + " servico(s)");
                    });
                    break;

                case 5:
                    System.out.print("CPF do autonomo: ");
                    String cpfTotal = entrada.nextLine();

                    double total = autonomos.stream()
                            .filter(a -> a.cpf.equals(cpfTotal))
                            .flatMap(a -> a.servicos.stream())
                            .mapToDouble(s -> s.valor)
                            .sum();

                    System.out.println("Total: R$ " + total);
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        entrada.close();
    }
}
