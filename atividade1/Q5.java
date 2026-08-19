package atividade1;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        String usu = input.next();
        System.out.print("Digite sua senha: ");
        String senha = input.next();

        if(usu.equals("admin") && senha.equals("1234")){
            System.out.println("Usuário encontrado");
            }else{
            System.out.println("Usuário não encontrado");
        }
    }
}
