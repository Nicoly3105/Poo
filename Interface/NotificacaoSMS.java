package Interface;

public class NotificacaoSMS implements ExemploInterface{
    public void notificacao(){
        System.out.println("Notificação enviada por SMS...");

    }
    @Override
    public void notificar() {
        System.out.println("Notificação por SMS via interface...");
    }
}
