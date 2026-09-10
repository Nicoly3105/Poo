package Revisao;

public class Main {
    public static void main(String[] args) {      
        try{ 
        Personagem Guerreiro = new Guerreiro("Alado ",500, true);
        Personagem Bruxo = new Bruxo("Confessor ", 200, true);
        Guerreiro.atacar();
        Bruxo.atacar();

        System.out.println(Guerreiro);
        System.out.println(Bruxo);
        }catch (RuntimeException e){
        System.out.println("Erro: " +e.getMessage());
        }
    } 
}
