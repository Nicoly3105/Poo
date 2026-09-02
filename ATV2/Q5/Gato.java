package ATV2.Q5;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Miauu");
    }
    @Override
    public void mover() {
        System.out.println("Pedindo comida");
    }
}