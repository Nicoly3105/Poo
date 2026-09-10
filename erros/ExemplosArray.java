public class ExemplosArray {
    public static void main(String[] args) {
        try{
        String [] nomes = new String[]{"José","Maria","Pedro"};
        System.out.println(nomes[5]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Posição inexistente.Erro: "+e.getMessage());
    }finally{
        System.out.println("Sempre será executada.");
    }
}
}
