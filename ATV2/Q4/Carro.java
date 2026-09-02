package ATV2.Q4;

public class Carro {
    String modelo;
    String placa;
    boolean ligado;
    Motorista motorista;
    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.ligado = false;
        this.motorista = null;
    }

    public void atribuirMotorista(Motorista motorista) {
        this.motorista = motorista;
        System.out.println("Motorista atribuído ao carro.");
    }

    public void ligar() {
        if (motorista != null) {
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("Não é possível ligar.");
            System.out.println("Nenhum motorista foi atribuído.");
        }
    }
}
