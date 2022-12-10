public class Jogo {
    private String nomeDoJogo;
    private int quantidadeDeCreditos;

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }
    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }
    public int getQuantidadeDeCreditos() {
        return quantidadeDeCreditos;
    }
    public void setQuantidadeDeCreditos(int quantidadeDeCreditos) {
        this.quantidadeDeCreditos = quantidadeDeCreditos;
    }

    public void passarCartaoParaJogar (Cartao cartao){
        int saldoDOCartao= cartao.getSaldoAtual();
        if (saldoDOCartao >= quantidadeDeCreditos){
           cartao.setSaldoAtual(saldoDOCartao - quantidadeDeCreditos);
           int tiquetisGanhos = 20;
           System.out.format("Divirta-se no Atari Game! %d %d %d", cartao.getNumeroCartão(),tiquetisGanhos, cartao.getSaldoAtual());
           System.out.println(" ");

        } else {
            System.out.println(" ");
            System.out.println("Crédtios insufientes");
        }
    }
}
