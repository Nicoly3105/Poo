public class App {
    
    static void main(String[] args){
        Classes contadenick = new Classes();
        contadenick.cliente = new Cliente();
        contadenick.cliente.contato = new Contato();
        contadenick.cliente.endereco = new Endereco();

        contadenick.agencia = "1053";
        contadenick.n_conta = "10061121";
        contadenick.tipo_conta = "Porpança" ;
        contadenick.saldo = 0.0;
        contadenick.cliente.nume = "Cocoly";
        contadenick.cliente.rg = "40028922";
        contadenick.cliente.contato.telefone = "83993445923";
        contadenick.cliente.contato.email = "nickzinhadaxj@gemeaetiow.com";
        contadenick.cliente.endereco.rua = "rua da minha casa";
        contadenick.cliente.endereco.num = "99";
        contadenick.cliente.endereco.bairro= "casa da mae joana";
        contadenick.cliente.endereco.cidade = "caja city";
        contadenick.cliente.endereco.cep = "6969696699";


        System.out.println("------------------------------------------------");

        Classes contadekamisinha = new Classes();
        contadekamisinha.cliente = new Cliente();
        contadekamisinha.cliente.contato = new Contato();
        contadekamisinha.cliente.endereco = new Endereco();

        

        contadekamisinha.agencia = "1053";
        contadekamisinha.n_conta = "10061121";
        contadekamisinha.tipo_conta = "Porpança" ;
        contadekamisinha.saldo = 0.0;
        contadekamisinha.cliente.nume = "Kamisinha p";
        contadekamisinha.cliente.rg = "69";
        contadekamisinha.cliente.contato.telefone = "83974007252";
        contadekamisinha.cliente.contato.email = "kamisinhaextragg@gemeaetiow.com";
        contadekamisinha.cliente.endereco.rua = "rua da minha casa";
        contadekamisinha.cliente.endereco.num = "99";
        contadekamisinha.cliente.endereco.bairro= "casa da mae joana";
        contadekamisinha.cliente.endereco.cidade = "caja city";
        contadekamisinha.cliente.endereco.cep = "6969696699";

        System.out.println("Saldo inicial de Nick" + contadenick.saldo );
        contadenick.depositar(500.0);
        System.out.println(contadenick);
        System.out.println("------------------------------------------------");
        System.out.println("Saldo inicial de Kamisinha" + contadekamisinha.saldo );
        contadekamisinha.depositar(900.0);
        System.out.println(contadekamisinha);

       

        

    }
}
