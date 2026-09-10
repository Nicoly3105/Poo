package Revisao;

public class Guerreiro extends Personagem {
    private boolean possuiEspada;

    public Guerreiro(String nome, int vida, boolean possuiEspada) {
        super(nome, vida);
        this.possuiEspada = possuiEspada;
    }

    public boolean isPossuiEspada() {
        return possuiEspada;
    }

    public void setPossuiEspada(boolean possuiEspada) {
        this.possuiEspada = possuiEspada;
    }

    @Override
    public void atacar() {
        System.out.println(super.getNome() + "Atacando com a espada!");
    }
    @Override
    public String toString() {
        return "~Guerreiro~ \nnome: " + super.getNome() + "\nvida: " + super.getVida() + "\npossuiEspada: " + possuiEspada + "";
    }
    
}
