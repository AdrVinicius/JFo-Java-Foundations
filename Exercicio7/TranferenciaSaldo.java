public class TranferenciaSaldo {
    public void transferirCredito(Cartao c1, Cartao c2, int creditos){
      int saldoDOCartaoC1 = c1.getSaldoAtual();
      int saldoDOCartaoC2 = c2.getSaldoAtual();


      if (saldoDOCartaoC1 >= creditos){
        c1.setSaldoAtual(saldoDOCartaoC1 - creditos);
        c2.setSaldoAtual(saldoDOCartaoC2 + creditos);

        System.out.println(" Saldo do cartão 1: " + c1.getSaldoAtual());
        
        System.out.println("Saldo do cartão 2: " + c2.getSaldoAtual());
      } else {
        System.out.println("Transferencia nao poder ser realizada");
      }
    }
} 
