package ATV2.Q6;

public class Main {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda(
            10,
            100,
            500
        );
        System.out.println(
            "Frete padrão: R$ " + encomenda.calcularFretePadrao()
        );
        System.out.println(
            "Frete expresso: R$ " + encomenda.calcularFreteExpresso()
        );
    }
}
