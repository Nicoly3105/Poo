package ATV2.Q6;

public class Encomenda {
    double pesoKg;
    double distanciaKm;
    double valorDeclarado;

    public Encomenda(double pesoKg, double distanciaKm, double valorDeclarado) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.valorDeclarado = valorDeclarado;
    }

    public double calcularFretePadrao() {
        return (pesoKg * 5) + (distanciaKm * 0.50);
    }

    public double calcularFreteExpresso() {
        double fretePadrao = calcularFretePadrao();
        return fretePadrao + 30 + (valorDeclarado * 0.01);
    }
}