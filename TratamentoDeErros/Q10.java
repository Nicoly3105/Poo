package TratamentoDeErros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat formato =
                new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);

        System.out.print("Digite a data (dd/MM/yyyy): ");
        String texto = sc.nextLine();

        try {
            Date data = formato.parse(texto);
            System.out.println("Data valida: " + data);
        } catch (ParseException e) {
            System.out.println("Erro: formato ou data invalida.");
        }

        sc.close();
    }  
}
