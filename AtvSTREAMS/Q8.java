package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Pessoa {
    String nome;
    int idade;
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
public class Q8 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Nick", 18),
            new Pessoa("Pedro", 27),
            new Pessoa("Gabi", 25),
            new Pessoa("Gui", 28),
            new Pessoa("Isabella", 10)
        );
        List<String> nomes = pessoas.stream()
                .filter(pessoa -> pessoa.idade > 18)
                .map(pessoa -> pessoa.nome)
                .collect(Collectors.toList());
        System.out.println(nomes);
    }
}
