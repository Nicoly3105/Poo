package Interface;

public class App {
    static void main(String[] args) {
        NotificacaoEmail ne = new NotificacaoEmail();
        ne.notificacao();

        NotificacaoSMS ns = new NotificacaoSMS();
        ns.notificacao();

        ExemploInterface ie = new NotificacaoEmail();
        ie.notificar();

        ExemploInterface is = new NotificacaoSMS();
        is.notificar();
    }
}

