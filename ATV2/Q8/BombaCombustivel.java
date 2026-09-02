package ATV2.Q8;

public class BombaCombustivel {
    String tipoCombustivel;
    double valorPorLitro;
    double quantidadeCombustivelNaBomba;
    public BombaCombustivel(String tipoCombustivel,double valorPorLitro,double quantidadeCombustivelNaBomba) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorPorLitro;
        if (litros <= quantidadeCombustivelNaBomba) {
            quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba - litros;
            System.out.println("Litros abastecidos: " + litros);
        } else {
            System.out.println("Combustível insuficiente.");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= quantidadeCombustivelNaBomba) {
            double valor = litros * valorPorLitro;
            quantidadeCombustivelNaBomba =quantidadeCombustivelNaBomba - litros;
            System.out.println("Total a pagar: R$ " + valor);
        } else {
            System.out.println("Combustível insuficiente.");
        }
    }
}
