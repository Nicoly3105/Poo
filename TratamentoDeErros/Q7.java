package TratamentoDeErros;

public class Q7 {
    public static void main(String[] args) {
        String[] valores = {"10.5", "abc", "20.7", "5"};
        double[] numeros = new double[valores.length];

        for (int i = 0; i < valores.length; i++) {
            try {
                numeros[i] = Double.parseDouble(valores[i]);
                System.out.println("Convertido: " + numeros[i]);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter: " + valores[i]);
            }
        }
    }
}
