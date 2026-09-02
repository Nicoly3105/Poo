package ATV2.Q7;

public class Main {
    public static void main(String[] args) {
        Lampada lampada =new Lampada(false, 50, "Branca");
        lampada.ajustarIntensidade(80);
        lampada.ligar();
        lampada.ajustarIntensidade(80);
        lampada.mudarCor("Azul");
        lampada.desligar();
    }
}
