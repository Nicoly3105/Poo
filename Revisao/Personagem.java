package Revisao;


public class Personagem {
   private String nome;
  private int vida;

  public Personagem(){}


  public  Personagem(String nome, int vida){
    if(nome.length() < 2){
      throw new RuntimeException("O nome deve possuir mais de 3 caracteres!");
    }
    this.nome = nome;
    this.vida = vida;
  }

  //get e set estudar muito

  public void atacar(){
    System.out.println(nome + " em ataque...");
  }


  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public int getVida() {
    return vida;
  }


  public void setVida(int vida) {
    this.vida = vida;
  }


  @Override
  public String toString() {
    return "~Personagem~ \nnome: " + nome + "\nvida: " + vida + "";
  }

  

  //tostring ESTUDAR
}