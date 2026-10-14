package colecoes;

public class Produto {
    private String descricao;
    private double peso;
    private int estoque;
    public Produto(String descricao, double peso, int estoque) {
        this.descricao = descricao;
        this.peso = peso;
        this.estoque = estoque;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", peso=" + peso + ", estoque=" + estoque + "]";
    }
    
}
