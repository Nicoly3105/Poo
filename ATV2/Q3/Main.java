package ATV2.Q3;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(
            "Professor",
            "111.111.111-11",
            8000,
            0.5,
            10000
        );
        Vendedor vendedor = new Vendedor(
            "Aluna",
            "222.222.222-22",
            1000,
            1,
            5000
        );
        System.out.println("Salário do gerente: " + gerente.calcularSalario());
        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
    }
}
