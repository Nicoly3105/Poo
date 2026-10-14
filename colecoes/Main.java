package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int total_elementos = 10000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("------------Inserção-------------");

        System.out.println("ArrayList");
        //long é um inteiro grandao
        long insercaoInicial = System.currentTimeMillis();
        for (int i = 0; i < total_elementos; i++) {
            arrayList.addFirst(i);
            
        }
        //calcula em milisegundos
        long tempoTotal = System.currentTimeMillis();
        System.out.println("Tempo inserção ArrayList: " + tempoTotal + "ms");
        System.out.println("---------------------");
        System.out.println("LinkedList");
        insercaoInicial = System.currentTimeMillis();
        //vai pegar um inteiro == 0 e vai rodar pelo tamanho do totalElementos
        for (int i = 0; i < total_elementos; i++) {
            //adicionar
            linkedList.add(i);
            
        }
        tempoTotal = System.currentTimeMillis() - insercaoInicial;
        System.out.println("tempo inserção LinkedList: " + tempoTotal + "ms");
        System.out.println("----------Leitura----------");
        long tempoLeitura = System.currentTimeMillis();
        for (int i = 0; i < total_elementos; i++) {
            //pegar
            arrayList.get(i);
            
        }
        tempoLeitura = System.currentTimeMillis() - tempoLeitura;
        System.out.println("Tempo leitura LinkedList: " + tempoLeitura + "ms");

    }
}
