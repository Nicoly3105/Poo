public class Appsla {
     public static void main(String[] args) {
        Cadastro c = new Cadastro();
        try{
            c.cadastrar("Nick", "40028922000");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
     }
}
