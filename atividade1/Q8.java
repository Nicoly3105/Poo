package atividade1;
import java.util.Locale;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Quanto você ganha por hora?  ");
        double ganha = input.nextDouble();

        System.out.print("Número de horas trabalhadas no mês?  ");
        int horas = input.nextInt();

        double salarioBruto = ganha * horas;

        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        double gastos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - gastos;

        System.out.println("\n");
        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.println("IR (11%) : R$" + ir);
        System.out.println("INSS (8%) : R$" + inss);
        System.out.println("Sindicato (5%) : R$" + sindicato);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);


        
    }
}
