package ATV2.Q2;

public class Main {
    public static void main(String[] args) {

        Termostato termostato = new Termostato(28, 22, "Resfriar");
        termostato.executarCiclo();
        termostato.definirTemperatura(24);
        termostato.alterarModo("Aquecer");
        termostato.executarCiclo();
    }
}
