import java.util.Date;

public class Partida implements APartida {
	public static Object iniciarPartida;
	private Time timeLocal;
	private int scoreLocal;
	private Time timeVisitante;
	private int scoreVisitante;
	private Date dataPartida;
	public Object getscoreLocal;
	int golsCasa;
	
	public Time getTimeLocal() 
	{
		return timeLocal;
	}

	public void setTimeLocal(Time timeLocal) 
	{
		this.timeLocal = timeLocal;
	}
	
	public Time getTimeVisitante() 
	{
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) 
	{
		this.timeVisitante = timeVisitante;
	}

	public Date getDataPartida() 
	{
		return dataPartida;
	}

	public void setDataPartida(Date dataPartida) 
	{
		this.dataPartida = dataPartida;
	}
	
	public int Random_Placar(int min, int max)
	{
		int numrandom = (int)((Math.random()*((max-min)+1))+min);
		return numrandom;
	}

	
	
	@Override
	public void iniciarPartida() {

		System.out.println(" ");
		System.out.println("Hino Nacional!");
		System.out.println("Apita o Árbitro, começa a primeira partida do campeonato mineiro!");

		scoreLocal = Random_Placar(0,10);	
		scoreVisitante = Random_Placar(0,10);	
		}



	@Override
	public void mostrarResultado() 
		{
		System.out.println(timeLocal.getNome()+" "+scoreLocal+ " X "+scoreVisitante+" "+timeVisitante.getNome());
		try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		}
	


	@Override
	public void finalizarPartida() 
		{
		if (scoreLocal == scoreVisitante)
		{	// TimeLocal Empatou (+1 Ponto)
			timeLocal.setQtdEmpates(timeLocal.getQtdEmpates()+1);
			timeLocal.setQtdPontos(timeLocal.getQtdPontos()+1);
			// TimeVisitante Empatou (+1 Ponto)
			timeVisitante.setQtdEmpates(timeVisitante.getQtdEmpates()+1);
			timeVisitante.setQtdPontos(timeVisitante.getQtdPontos()+1);
		}
		

		
		else if(scoreLocal > scoreVisitante)
		{
			// TimeLocal Venceu (+3 Pontos)
			timeLocal.setQtdVitorias(timeLocal.getQtdVitorias() + 1); 
			timeLocal.setQtdPontos(timeLocal.getQtdPontos() + 3);
			// TimeVisitante Perdeu (+1 Derrota)
			timeVisitante.setQtdDerrotas(timeVisitante.getQtdDerrotas() + 1);
		}
		
		
		else
		{
			// TimeVisitante Venceu (+3 Pontos)
			timeVisitante.setQtdVitorias(timeVisitante.getQtdVitorias() + 1);
			timeVisitante.setQtdPontos(timeVisitante.getQtdPontos() +3);
			// TimeLocal Perdeu (+1 Derrota)
			timeLocal.setQtdDerrotas(timeLocal.getQtdDerrotas() + 1);
		}

		if (scoreLocal>= 0){
			golsCasa = scoreLocal;
			System.out.println(" ");

			System.out.println("Saldo de gols do Atletico é " + golsCasa);
		}

		if (scoreVisitante>= 0){
			golsCasa = scoreLocal;
			System.out.println("Saldo de gols do Cruzeiro é " + scoreVisitante);
		}



	}	

			
		public int partidaLocal(int scoreLocal) {
			System.out.println("Saldo de gols" + scoreLocal);
			return scoreLocal;
		}

		public int partidaVisitante(int scoreVisitante) {
			System.out.println("Saldo de gols" + scoreVisitante);
			return scoreVisitante;
		}

		public static Object getIniciarPartida() {
			return iniciarPartida;
		}

		public static void setIniciarPartida(Object iniciarPartida) {
			Partida.iniciarPartida = iniciarPartida;
		}

		public int getScoreLocal() {
			return scoreLocal;
		}

		public void setScoreLocal(int scoreLocal) {
			this.scoreLocal = scoreLocal;
		}

		public int getScoreVisitante() {
			return scoreVisitante;
		}

		public void setScoreVisitante(int scoreVisitante) {
			this.scoreVisitante = scoreVisitante;
		}

		public Object getGetscoreLocal() {
			return getscoreLocal;
		}

		public void setGetscoreLocal(Object getscoreLocal) {
			this.getscoreLocal = getscoreLocal;
		}

}		
