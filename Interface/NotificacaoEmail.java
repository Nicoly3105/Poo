package Interface;

public class NotificacaoEmail implements ExemploInterface{
    public void notificacao(){
        System.out.println("Notificação enviada pos email...");
    }

    @Override
    public void notificar() {
        System.out.println("Notificação por email via interface...");
    }
    
}
