package ATV2.Q5;

public class Animal {
    String nome;
    int idade;
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }

    public void mover() {
        System.out.println("O animal se moveu.");
    }
}
