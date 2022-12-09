import java.util.Scanner;

public class testClass {

    public static void main( String [] args) {

        computerMethods calculadora = new computerMethods();

        Scanner teclado = new Scanner(System.in);

        int temperatura = teclado.nextInt();
        
    
        System.out.print(" Converte " + calculadora.fToc(temperatura ));
        System.out.print(" Hyp " + calculadora.hypotenuse(5, 6 ));
        System.out.print(" Dados " + calculadora.roll());

        teclado.close();
        
    }
    
}
