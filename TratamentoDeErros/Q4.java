package TratamentoDeErros;

public class Q4 {
    public static void main(String[] args) {
        String texto = null;

        try {
            System.out.println("Comprimento: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: a string esta null.");
        }
    }
}
