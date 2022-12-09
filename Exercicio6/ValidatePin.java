import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {

        double pinUsuario = 1010;
        double InseridoPin;
        

        System.out.println("Insira o PIN");

        Scanner tecladoScanner = new Scanner(System.in);

        InseridoPin = tecladoScanner.nextDouble();
        


        while (pinUsuario == InseridoPin){
            
            System.out.println("PIN correto. Você tem permissão para entrar na conta");
        }


        while ( pinUsuario != InseridoPin){
            System.out.println("PIN incorreto. Digite um PIN valido ");
            InseridoPin = tecladoScanner.nextDouble();
            if (InseridoPin == pinUsuario ){
                System.out.println("PIN correto. Você tem permissão para entrar na conta");

            }
        
        }

        tecladoScanner.close();
    }

}
