package TratamentoDeErros;

import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static double calcularMedia(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista esta vazia ou null.");
        }

        double soma = 0;

        for (Double numero : numeros) {
            if (numero == null) {
                throw new IllegalArgumentException("Existe um valor null.");
            }
            soma += numero;
        }

        return soma / numeros.size();
    }  

    public static void main(String[] args) {
        List<Double> valores = Arrays.asList(7.0, 8.0, 9.0);

        try {
            System.out.println("Media: " + calcularMedia(valores));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
