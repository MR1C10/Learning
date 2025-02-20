package main;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = date.format(formatter);
        System.out.println("Hoje é " + data + "\nAula de Java com professor Fabio");
        
//        System.out.println("Digite um numero para ter a tabuada:\n ");;
//        int numero = ler.nextInt();
//        
//        System.out.println("Digite o numero de vezes que deseja multiplicar:\n ");
//        int multiplicador = ler.nextInt();
//        
//        int inicio = 1;        
//        while (inicio <= multiplicador){
//            int mult = numero * inicio;
//            System.out.println(mult); 
//            inicio ++;
//        }

        
//        (parametro) ? a : b; // Operador ternario
       
        /*
        //Exercicio 1
        long cpf, rg;
        int rm;
        
        System.out.println("=== Faça seu cadastro ===");
        
        System.out.print("Escolha uma opção\n"
                + "1-Faça seu cadastro\n"
                + "2-Altere seu cadastro\n"
                + "3-exclua seu cadastro\n"
                + "4-sair :\n");
        int escolha = ler.nextInt();
        
        if (escolha == 1){
            System.out.print("Digite seu CPF sem pontos e traços: ");
            cpf = ler.nextLong();
            System.out.print("Digite seu RG sem pontos e traços: ");
            rg = ler.nextLong();
            System.out.print("Digite seu Rm: ");
            rm = ler.nextInt();
            
            System.out.println("Cadastro realizado com sucesso!!!");
        }else if(escolha == 2){
            System.out.println("Registro alterado com sucesso!!!");
        }else if(escolha == 3){
            System.out.println("Registro excluido com sucesso!!!");
        }else if (escolha == 4){
            System.out.println("Saindo do sistema...");
        }
        else{
            System.out.println("**Opção invalida**");
        }*/
        
        
//        else if (escolha == 2){
//            System.out.print("Digite seu CPF sem pontos e traços: ");
//            cpf = ler.nextLong();
//            System.out.print("\nDigite seu RG sem pontos e traços: ");
//            rg = ler.nextLong();
//            System.out.print("\nDigite seu Rm: ");
//            rm = ler.nextInt();
//        }
//        

        // Exercicio 2
        System.out.println("Qual sua idade: ");
        int idade = ler.nextInt();
        
        if(idade >= 1 && idade <=10){
            System.out.println("INFANTIL");
        }else if (idade >= 11 && idade <= 13 ){
            System.out.println("INFANTO-JUVENIL");
        }else if (idade >= 14 && idade <= 17){
            System.out.println("PRE-ADOLESCENTE");
        }else if (idade < 1){
            System.out.println("VOCÊ NÃO EXISTE '_' ");
        }else{
            System.out.println("ADULTO");
        }
    }   
}
