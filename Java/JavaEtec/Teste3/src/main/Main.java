package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        
//        String nome;
//        long numero, cep;
//        String email;
//        
        Scanner ler = new Scanner(System.in);
        /*
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite seu telefone: ");
        numero = ler.nextLong();
        System.out.println("Digite seu cep: ");
        cep = ler.nextInt();
        ler.nextLine();// Temos que consumir o enter pra nao pular o proximo input  
        System.out.println("Digite seu email: ");
        email = ler.nextLine();
        
        System.out.println("\n" + nome + "\n" + numero + "\n" + cep + "\n" + email + "\nCadastro comcluido!");
        */
        
        // Exercicio 1
        
        System.out.println("Qual seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite sua primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = ler.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = ler.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(String.format("O aluno " + nome + " teve como media " + "%.2f", media));
//        */
      
      // Exercicio 2
      /*
      System.out.println("Quanto vc tem? ");
      double dinheiro = ler.nextDouble();
      
      double porcen = dinheiro * 0.1;
      System.out.println("10% de " + dinheiro + " é " + porcen );
      */
      
      // Exercicio 3
      /*
      int num1, num2, operacao;
      
      System.out.println("Digite um numero: ");
      num1 = ler.nextInt();
      System.out.println("Digite mais um numero: ");
      num2 = ler.nextInt();
      
      System.out.println(
              "soma = " + (num1 + num2) + 
              "\nmultiplicação = " + (num1 * num2) +
              "\nDivisão = " + (num1 / num2) +
              "\nSubtração" + (num1 - num2)
      );
      */
    }
}
