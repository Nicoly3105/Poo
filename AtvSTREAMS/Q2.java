package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList(
            "Nick", "Clara", "Lara", "Kamille"
        );

        nomes.stream()
             .map(nome -> nome.toUpperCase())
             .forEach(System.out::println);
    }
}
