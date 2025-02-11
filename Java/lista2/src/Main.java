import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                Scanner Ler = new Scanner(System.in);

                // 1. Elabore um algoritmo que leia um número e
                // mostre o seu valor, se ele for menor que cinco.

                // System.out.println("Digite um numero: ");
                // int number = Ler.nextInt();
                // if (number < 5 ){
                // System.out.println(number);
                // }

                // 2. Crie um algoritmo que leia um número, some ao seu valor cinco e mostre o
                // resultado se ele for maior que dez.

                // System.out.println("Digite um numero: ");
                // int num = Ler.nextInt();
                // num += 5;
                // if (num > 10){
                // System.out.println(num);
                // }

                // 3. Desenvolva um algoritmo que leia um número, subtraia de seu valor o número
                // 10 e mostre o resultado se ele for maior que três.

                // System.out.println("Digite um numero: ");
                // int num = Ler.nextInt();
                // num -= 10;
                // if (num > 3){
                // System.out.println(num);
                // }

                // 4. Crie um algoritmo que leia três números some 5 aos seus valores e mostre
                // os
                // valores resultantes maiores que 10.

                // System.out.println("Digite um numero: ");
                // int num = Ler.nextInt();
                // num += 5;
                // System.out.println("Digite um numero: ");
                // int num2 = Ler.nextInt();
                // num += 5;
                // System.out.println("Digite um numero: ");
                // int num3 = Ler.nextInt();
                // num += 5;
                //
                // if (num > 10){
                // System.out.println(num);
                // }
                // else if (num2 > 10){
                // System.out.println(num2);
                // }
                // else if (num3 > 10){
                // System.out.println(num3);
                // }

                // 5. Elabore um algoritmo que leia dois números e mostre os seus valores
                // multiplicados por 10 se a soma dos valores originais for menor que 20.

                // System.out.println("Digite um numero: ");
                // int num = Ler.nextInt();
                // System.out.println("Digite um numero: ");
                // int num2 = Ler.nextInt();
                //
                // if ((num + num2) < 20) {
                // num *= 10;
                // num2 *= 10;
                // System.out.println(num + "\n" + num2);
                // }

                // 6. Desenvolva um algoritmo que leia um número e mostre o seu resultado
                // multiplicado por 3 for maior que 15.

                // System.out.println("Digite um numero: ");
                // int num = Ler.nextInt();
                // System.out.println(num);
                // if (num > 15){
                // num *= 3;
                // System.out.println(num);
                // }

                // 7. Crie um algoritmo que leia três números, some seus valores e mostre o
                // resultado se ele for maior que 20.

                // System.out.println("Digite um numero: ");
                // int num = Ler.nextInt();
                // System.out.println("Digite um numero: ");
                // int num2 = Ler.nextInt();
                // System.out.println("Digite um numero: ");
                // int num3 = Ler.nextInt();
                //
                // num += num2 + num3;
                // if (num > 20){
                // System.out.println(num);
                // }

                // 8. Elabore um algoritmo que leia dois números e mostre os seus valores se
                // eles
                // forem iguais.

                // System.out.println("Digite um numero: ");
                // int num = Ler.nextInt();
                // System.out.println("Digite um numero: ");
                // int num2 = Ler.nextInt();
                //
                // if (num == num2){
                // System.out.println(num);
                // }

                // 9. Crie um algoritmo que leia um numero e mostre o seu valor dividido por 2,
                // se o
                // resultado for maior que 20.

                // System.out.println("Digite um numero: ");
                // int num = Ler.nextInt();
                // num /= 2;
                //
                // if (num > 20){System.out.println(num);}

                // 10. Elabore um algoritmo que leia um número e mostre a tabuada do número lido
                // se ele for menor que 10.

                System.out.println("Digite um numero: ");
                int num = Ler.nextInt();

                if (num > 10) {
                        int a = 1;
                        while (a < 10) {
                                int x = num * a;
                                System.out.println(x);
                                a += 1;
                        }
                }
        }
}