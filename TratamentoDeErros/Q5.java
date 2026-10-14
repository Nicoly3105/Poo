package TratamentoDeErros;

public class Q5 {
    public static void main(String[] args) {
        String[] nomes = {"ana", null, "pedro", "maria"};

        for (int i = 0; i < nomes.length; i++) {
            try {
                nomes[i] = nomes[i].toUpperCase();
                System.out.println(nomes[i]);
            } catch (NullPointerException e) {
                System.out.println("Erro: elemento " + i + " esta null.");
            }
        }
    }   
}
