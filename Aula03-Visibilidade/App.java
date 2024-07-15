public class App {
    public static void main( String[] args){
        System.out.println("Rodou!");
        Caneta cn1 = new Caneta("Bic Transparente","Preta");

        cn1.setPonta(0.5f);
        cn1.carga = 80;

      
        cn1.destampar();
        cn1.status();
        cn1.rabiscar();
    }
}