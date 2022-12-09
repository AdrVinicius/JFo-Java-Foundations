import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //Nesta historia nosso você deve fornecer dados para fomentar um programa.
     Scanner sc = new Scanner(System.in);
     System.out.print("Insira o nome:");
     String nome = sc.next();
     System.out.print("Insira a idade: ");
     int idade = sc.nextInt();
     System.out.print("Informe a altura: ");
     double altura = sc.nextDouble();
     System.out.print("Informe o signo: ");
     String signo = sc.next();
     System.out.print("Informe cor favorita: ");
     String cor = sc.next();
     System.out.print("Informe o dois ultimos digitos do cpf: ");
     int cpf = sc.nextInt();
     System.out.print("Informe pais de origem: ");
     String pais = sc.next();
     System.out.print("Informe estado: ");
     String estado = sc.next();
     System.out.print("Informe cidade: ");
     String cidade = sc.next();
     System.out.print("Insira o sexo: ");
     String sexo = sc.next();

     System.out.println();

     //Nesta etapa foram feitas algunas contas com dados.

     System.out.println("Qual dobro da idade informada ? ");
     int dobroidade = idade*2;
     System.out.print("O dobro da idade é " + dobroidade);
     System.out.println();
     System.out.println("Qual o triplo da altura do campeão ? ");
     double triploaltura = altura*3;
     System.out.println("O triplo da altura é " + triploaltura);
     System.out.println();
     // Dados coletados.
     System.out.println("Os dados coletados são");
     System.out.println("Nome: " + nome);
     System.out.println("Idade: " + idade);
     System.out.println("Altura: " + altura);
     System.out.println("Signo: " + signo);
     System.out.println("Cpf: " + cpf);
     System.out.println("Cor: " + cor);
     System.out.println("País: " + pais);
     System.out.println("Estado: " + estado);
     System.out.println("Cidade: " + cidade);
     System.out.println("Sexo: " + sexo);

     sc.close();

    }
}
