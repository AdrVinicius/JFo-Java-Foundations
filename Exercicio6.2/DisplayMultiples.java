import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        System.out.print("Insira um número: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        

        for (int i=1; i<= 12; i++){
            System.out.println(numero + "x" + i + " = "+ numero*i);


        }
        teclado.close();
       
    }

}
