package ATV2.Q2;

public class Termostato {
    double temperaturaAtual;
    double temperaturaDesejada;
    String modo;

    public Termostato(double temperaturaAtual, double temperaturaDesejada, String modo) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
        this.modo = modo;
    }

    public void definirTemperatura(double temp) {
        if (temp >= 16 && temp <= 30) {
            temperaturaDesejada = temp;
            System.out.println("Temperatura definida!");
        } else {
            System.out.println("A temperatura deve estar entre 16°C e 30°C.");
        }
    }

    public void alterarModo(String novoModo) {
        if (novoModo.equals("Resfriar") ||
            novoModo.equals("Aquecer") ||
            novoModo.equals("Desligado")) {
            modo = novoModo;
            System.out.println("Modo alterado para: " + modo);
        } else {
            System.out.println("Modo inválido.");
        }
    }

    public void executarCiclo() {
        if (modo.equals("Resfriar")) {
            if (temperaturaAtual > temperaturaDesejada) {
                System.out.println("Compressor ligado para resfriar.");
            } else {
                System.out.println("O ambiente já atingiu a temperatura desejada.");
            }
        } else if (modo.equals("Aquecer")) {
            if (temperaturaAtual < temperaturaDesejada) {
                System.out.println("Compressor ligado para aquecer.");
            } else {
                System.out.println("O ambiente já atingiu a temperatura desejada.");
            }
        } else {
            System.out.println("Sistema desligado.");
        }
    }
}
