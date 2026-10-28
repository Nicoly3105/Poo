package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 4, 7, 13, 19);

        boolean resultado = numeros.stream()
                .allMatch(n -> n > 0);

        System.out.println(resultado);
    }
}
