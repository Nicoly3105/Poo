package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList(
            "Nick", "Lara", "José", "Maria",
            "Kamille", "Clara", "Matheus", "Francisco"
        );

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(resultado);
    }
}
