package Interface.estudo_de_caso;

public class LivroFisico extends Livro {

    public LivroFisico(String titulo, String autor, double valor) {
        super(titulo, autor, valor);
    }
    
    @Override
    public double getValor() {
        return super.getValor() * 1.05;
    }

}
