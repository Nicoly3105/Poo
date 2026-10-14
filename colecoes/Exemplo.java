package colecoes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Exemplo {
    static void main() {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 4.5, 0));
        produtos.add(new Produto("Feijão", 2.0, 20));
        produtos.add(new Produto("Açucar", 3.5, 30));
        produtos.add(new Produto("Cuscuz", 1.5, 0));

        //System.out.println( "Estoque: " + produtos);
        // for(Produto p : produtos){
        //     if(p.getEstoque() == 0){
        //         produtos.remove(p);
        //     }
        // }
        // System.out.println("");
        // System.out.println("Estoque: " + produtos);

        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()){

            Produto produto = produtoIterator.next();
            if(produto.getEstoque() == 0){
                produtoIterator.remove();
            }
        System.out.println("Pós-Iterator");
        System.out.println("Estoque: " + produtos);

        }
    }
}
