import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println(" Insira o comprimento de onda");
        double cumprimentoOnda = teclado.nextDouble();

    
        if ( cumprimentoOnda >= 380 && cumprimentoOnda <= 450) {
            
            System.out.println("A cor é Violeta");
        }
        
        if ( cumprimentoOnda >= 451 && cumprimentoOnda <=495 ){
            System.out.println("A cor é Azul");
        }

        if ( cumprimentoOnda >= 496 && cumprimentoOnda <=570 ){
            System.out.println("A cor é verde");
        }

        if ( cumprimentoOnda >= 571 && cumprimentoOnda <=590 ){
            System.out.println("A cor é amarelo");
        }

        if ( cumprimentoOnda >= 591 && cumprimentoOnda <=620 ){
            System.out.println("A cor é laranja");
        }

        if ( cumprimentoOnda >= 621 && cumprimentoOnda <=750 ){
            System.out.println("Vemelho");
        }

        if ( cumprimentoOnda >= 0 && cumprimentoOnda <=379 ){
            System.out.println("O comprimento de onda inserido não faz parte do espectro visível");
        }

        if ( cumprimentoOnda >= 751){
            System.out.println("O comprimento de onda inserido não faz parte do espectro visível");
        }

        teclado.close();
        }
    }
