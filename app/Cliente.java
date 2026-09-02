public class Cliente {
    
    String nume; 
    String rg;
    Endereco endereco;
    Contato contato;
    @Override
    public String toString() {
        return "Cliente [Ttular:\n" + nume + "Documento:\n" + rg  + "]";
    }
}
