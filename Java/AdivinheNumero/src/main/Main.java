package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random numero = new Random();
        int valor = numero.nextInt(20);

        int tentativas = 1;

        System.out.println("===Adivinhe o numero===");
        while (true) {
            System.out.println("Qual é o número?");
            int chute = read.nextInt();

            if (chute == valor) {
                System.out.println("Voce acertou!!!😎");
                System.out.println("Vocé precisou de " + tentativas + " para conseguir.");
                break;
            } else if (chute > valor) {
                System.out.println("O Numero é menor que " + chute);
                tentativas++;
            } else if (chute < valor) {
                System.out.println("O numero é maior que " + chute);
                tentativas++;
            }
        }
    }
}
