public class Fliperama {

    public static void main(String[] args) {
        
        Jogo atari;
        atari = new Jogo();
        atari.setNomeDoJogo("Atari Game");
        atari.setQuantidadeDeCreditos(75);

        
        Cartao cartao1;
        Cartao cartao2;

        cartao1 = new Cartao();
        cartao2 = new Cartao();

        cartao1.setSaldoAtual(100);
        cartao2.setSaldoAtual(120);

        atari.passarCartaoParaJogar(cartao1);
        System.out.print(cartao1.getSaldoAtual());

        TranferenciaSaldo t1 = new TranferenciaSaldo(); 
        t1.transferirCredito(cartao2, cartao1, 53);

    }
}
