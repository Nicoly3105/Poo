package ATV2.Q8;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 6.00, 1000);
        bomba.abastecerPorValor(60);
        bomba.abastecerPorLitro(10);
    }
}