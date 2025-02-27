package aulajavafabio;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AulaJavaFabio {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        // Exercicio 1
//        System.out.println("=== Veja se vc foi multado ===");;
//        
//        System.out.println("Qual a velocidade permitida na via?");
//        int velo_perm = ler.nextInt();
//        System.out.println("Qual a velocidade que vc está agora?");
//        int velo_atual = ler.nextInt();
//        
//        if (velo_atual > velo_perm){
//            System.out.println("Sim");
//            
//            int difer = velo_atual - velo_perm;
//            
//            if(difer == 10){
//                System.out.println("Multa R$80,00");
//            }
//            else if (difer > 11 && difer < 39){
//                System.out.println("Multa R$120,00");
//            }
//            else{
//                System.out.println("Multa R$200,00");
//            }
//        }
//        else{
//            System.out.println("Não");
//        }
        
        //Exercicio 2 
        
        System.out.println("Qual seu salario");
        float salario = ler.nextFloat();
        
        float salario_atual = salario - (salario * 2 / 100) ; // Desconto vt 2%
//        System.out.println(salario_atual);
        salario_atual = salario_atual - (salario_atual * 6 / 100);// Desconto tr 6%
//        System.out.println(salario_atual);
        double salario_atua = salario_atual - (salario_atual * 7 / 100);// Desconto idr 7%
//        System.out.println(salario_atual);
        
        if (salario_atua >= 1200.00f){
            double salario_final = salario_atua - (salario_atua * 15 / 100);
            System.out.printf("Seu salario liquido final é %.2f\n", salario_final);
        }
        else{
            System.out.printf("Seu salario liquido final é %.2f. Não houve desconto!\n", salario_atua);
        }
        
    }
    
}
