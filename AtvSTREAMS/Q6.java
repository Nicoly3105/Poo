package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(22, 25, 1, 89, 43);

        Optional<Integer> maior = numeros.stream()
                .max(Integer::compareTo);

        System.out.println(maior.get());
    }
}
