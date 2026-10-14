package Interface.estudo_de_caso;
import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro (Livro livro){
        this.livros.add(livro);
    }

    public double totalCarrinho(){
        double total = 0;

        for(Livro l : livros){
            total += l.getValor();
        }
        return total;
    };

    public void exibirCarrinho(){
        livros.forEach(l -> System.out.println(l.toString()));
    }

}
