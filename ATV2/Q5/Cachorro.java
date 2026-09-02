package ATV2.Q5;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
    @Override
    public void mover() {
        System.out.println("Correndo atrás da moto");
    }
}
