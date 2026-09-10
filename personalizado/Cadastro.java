public class Cadastro {
    public void cadastrar(String nome,String cpf){
        if (nome.isBlank()){
            throw new CadastroInvalidoException("O nome não pode ser nulo opu vazio.");
        }
        if(cpf.length() != 11){
            throw new CadastroInvalidoException("CPF inválido.");
        }
        System.out.println("Cadastro do usuário " + nome + "\n CPF: " + cpf + "\nrealizado com sucesso!");
        }
}

