package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(
            9, 25, 88, 78, 45, 34, 11, 72, 50, 66, 53
        );

        numeros.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
