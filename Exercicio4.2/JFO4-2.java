import java.util.Scanner;

public class processName {
    public static void main( String[]agrs) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome");
        String nome = teclado.next();

        System.out.println("Digite seu sobrenome");
        String Sobrenome2 = teclado.next();


        digaOlaPara(nome); 
        boasVindas(nome, Sobrenome2);

        teclado.close();
    
    }
    

    public static void digaOlaPara (String nome) {
    System.out.printf(" Ola , %s. \n ", nome);

    }

    public static void boasVindas (String nome, String sobrenome2 ) {
        String primeiraLetra = Character.toString(nome.charAt(0));

        System.out.printf(" O seu nome é %s. \n", sobrenome2 +", " +primeiraLetra);
        
        
    }
 
}
