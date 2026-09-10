package Revisao;

public class Bruxo extends Personagem {
    private boolean PossuiMana;

    public Bruxo (String nome, int vida, boolean PossuiMana){
        super(nome,vida);
        this.PossuiMana = PossuiMana;

    }

    public boolean isPossuiMana() {
        return PossuiMana;
    }

    public void setPossuiMana(boolean possuiMana) {
        PossuiMana = possuiMana;
    }
@Override
public void atacar() {
    System.out.println(super.getNome() + "Lançando magia!");
}
    @Override
    public String toString() {
        return "~Bruxo~ \nnome: " + super.getNome() + "\nvida: " + super.getVida() + "\nPossuiMana: " + PossuiMana + "";
    }
    
    
}
