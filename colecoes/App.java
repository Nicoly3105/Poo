package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //cria a lista
         List<String> nomes = new ArrayList<>();
         nomes.add("ALEX");
         nomes.add("DC");
         nomes.add("JOAO");
         nomes.add("MARIA");
         nomes.add("JOANA");
         nomes.add("MARIO");
         nomes.forEach(n -> System.out.println(n));
         
         nomes.set(1,"Nome alterado");

         //remove pelo indice
         nomes.remove(2);
         Collections.sort(nomes);
         
         nomes.forEach(n -> System.out.println(n));
         System.out.println("\n");

         List<Integer> idades = new ArrayList<>();

         idades.add(10);
         idades.add(20);
         idades.add(50);
         idades.add(30);
         
         //ordena elementos de uma lista
         Collections.sort(idades);
         idades.forEach(idade -> System.out.println(idade));

         //imprime a quantidade de itens da lista
         System.out.println("TOTAL DE ITENS: " +idades.size());

         // remove todos os itens
         idades.clear();

         List<Pessoa> pessoas = new ArrayList<>();
         pessoas.add(new Pessoa("Nick", "123", 'f', 18));
         pessoas.add(new Pessoa("Larao", "123", 'f', 18));
         pessoas.add(new Pessoa("kamis ynha", "123", 'f', 18));
         pessoas.add(new Pessoa("miss clarao", "123", 'f', 18));

        pessoas.forEach(pessoa -> System.out.println(pessoa));
         

    }
}
