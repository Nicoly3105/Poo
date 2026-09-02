package ATV2.Q9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente =
            new Cliente("Nicoly", "nicoly@email.com");
        Produto produto =
            new Produto("PC", 3500);
        Pedido pedido =
            new Pedido(cliente, produto, 2);
        pedido.processarPagamento(7500);
    }
}
