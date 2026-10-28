package optional;
import java.util.Optional;

public class Main {
    static void main(){
        Pessoa ana = new Pessoa("Ana", 20, Genero.FEMININO, null);
    
    Optional<String> valorQueExiste = Optional.of(ana.getNome());
    Optional<String> podeSerNuloOuNao = Optional.ofNullable(ana.getEmail());
    Optional<String> vazio = Optional.empty();

    System.out.println(valorQueExiste);
    System.out.println(podeSerNuloOuNao);
    System.out.println(vazio);
    Optional.of(ana.getEmail());

        String email = ana.getEmail();
        String contato;
        if(email != null){
            contato = email;
        }else{
            contato = "Usuário não possui email";
        }
        contato = Optional.ofNullable(email)
            .orElse("Ana não possui email");
    }
}
