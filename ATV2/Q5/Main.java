package ATV2.Q5;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Malu", 3);
        Gato gato = new Gato("Ninho", 10);
        cachorro.emitirSom();
        cachorro.mover();
        gato.emitirSom();
        gato.mover();
    }
}
