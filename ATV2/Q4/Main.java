package ATV2.Q4;

public class Main {
    public static void main(String[] args) {
        Motorista motorista = new Motorista(
            "Nick",
            "40028922"
        );

        Carro carro = new Carro(
            "Mitsubishi Lancer",
            "ABC-1234"
        );
        carro.ligar();
        carro.atribuirMotorista(motorista);
        carro.ligar();
    }
}