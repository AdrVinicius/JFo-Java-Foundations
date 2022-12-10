import java.util.Random;

public class CampeonatoMineiro {
	public static void main(String[] args) 
	{
		Time b1 = new Time();
		Time v2 = new Time();
		Partida p1 = new Partida();
		
		b1.setNome("Atletico");
		v2.setNome("Cruzeiro");

        Random aleatorio = new Random();
        int temperaturaAtual = aleatorio.nextInt(35) +1;
        System.out.println("A temperatura atual em celcius é: " +temperaturaAtual+"°");

        if(temperaturaAtual<10){
            System.out.println("Hoje está muito frio para um jogo");
        }

		if(temperaturaAtual>=10){
            System.out.println("Hoje está clima está muito favorável para uma partida");
        }
		
        
		p1.setTimeLocal(b1);
		p1.setTimeVisitante(v2);
		p1.iniciarPartida();
		p1.mostrarResultado();
		p1.finalizarPartida();
		
		b1.listar();
		try { Thread.sleep (4000); } 
		
		catch (InterruptedException ex) {}
		
		v2.listar();		
	}
}
