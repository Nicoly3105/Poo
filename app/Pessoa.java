public class Pessoa {
    
    private String nome;
    private String cpf;
    private String telefone;

    public void setNome(String nome) {
        if(nome.length() <2){
            System.out.println("O nome está inválido");
            return;
        }
        
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if(cpf.length() <11 || cpf.length()>11){
            System.out.println("Número de CPF errado");
        }
        
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getNome() {
        if(nome == null){
            return("Nome inválido");
        }
        return nome;
        
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    

}
