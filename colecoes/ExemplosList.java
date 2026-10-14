package colecoes;

import java.util.List;

public class ExemplosList {
    static void main(){

        List<Produto> ListaProdutos = 
            List.of(
                new Produto("Arroz", 5.5, 2),
                new Produto("Feijao", 5.6, 1),
                new Produto("batata", 6.0, 2)
            );
            System.out.println(ListaProdutos);
            ListaProdutos.add(new Produto("Farinha", 5.0, 4));
    }
}
