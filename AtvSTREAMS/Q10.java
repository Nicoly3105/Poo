package AtvSTREAMS;

import java.util.Arrays;
import java.util.List;

class Pedido {
    int id;
    double valor;

    Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }
}

public class Q10 {
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
            new Pedido(1, 100.0),
            new Pedido(2, 50.0),
            new Pedido(3, 75.0)
        );

        double total = pedidos.stream()
                .mapToDouble(pedido -> pedido.valor)
                .sum();

        System.out.println("Total: R$ " + total);
    }
}
