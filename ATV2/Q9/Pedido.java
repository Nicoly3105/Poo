package ATV2.Q9;

public class Pedido {
    Cliente cliente;
    Produto produto;
    int quantidade;
    boolean pago;
    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pago = false;
    }
    public void processarPagamento(double valorRecebido) {
        double total = produto.preco * quantidade;
        if (valorRecebido >= total) {
            pago = true;
            double troco = valorRecebido - total;
            System.out.println("Pagamento realizado!");
            System.out.println("Valor da compra: R$ " + total);
            System.out.println("Troco: R$ " + troco);
        } else {
            System.out.println("Valor insuficiente.");
        }
    }
}
