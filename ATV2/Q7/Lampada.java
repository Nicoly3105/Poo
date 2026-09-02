package ATV2.Q7;

public class Lampada{
    boolean ligada;
    int intensidade;
    String cor;

    public Lampada(boolean ligada, int intensidade, String cor) {
        this.ligada = ligada;
        this.intensidade = intensidade;
        this.cor = cor;
    }

    public void ligar() {
        ligada = true;
        System.out.println("Lâmpada ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Lâmpada desligada.");
    }

    public void ajustarIntensidade(int valor) {
        if (ligada) {
            if (valor >= 0 && valor <= 100) {
                intensidade = valor;
                System.out.println("Intensidade alterada.");
            } else {
                System.out.println(
                    "A intensidade deve estar entre 0 e 100."
                );
            }
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public void mudarCor(String novaCor) {
        if (ligada) {
            cor = novaCor;
            System.out.println("Cor alterada para " + cor);
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
