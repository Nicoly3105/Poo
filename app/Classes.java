
public class Classes {
    String agencia; 
    String n_conta;
    String tipo_conta;
    Double saldo;
    String titular;
    Cliente cliente;
    Endereco endereco;
    Contato contato;

        public void depositar(Double valorDeposito){
            saldo += valorDeposito;
        }

    @Override
    public String toString() {
        return "Classes [\nAgência:" + agencia + "\nNúmero de conta:" + n_conta + "\nTipo de conta:" + tipo_conta + "\nTitular"
                + cliente.nume + "\nEndereço:" + endereco + "]";
    }

    
}
