package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList(
            "sol", "lua", "casa", "gato", "pizza", "computador"
        );

        Map<Integer, List<String>> grupos = palavras.stream()
                .collect(Collectors.groupingBy(
                    palavra -> palavra.length()
                ));

        System.out.println(grupos);
    }
}
