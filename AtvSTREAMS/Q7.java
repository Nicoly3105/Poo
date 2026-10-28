package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList(
            "casa", "pc", "hamburguer", "lasanha", "lua", "faculdade"
        );

        long quantidade = palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .count();

        System.out.println(quantidade);
    }
}
