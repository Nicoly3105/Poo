package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(
            7, 33, 30, 5, 47, 13, 89, 77, 56, 4, 55
        );

        long quantidade = numeros.stream()
                                 .filter(n -> n > 10)
                                 .count();

        System.out.println(quantidade);
    }
}
