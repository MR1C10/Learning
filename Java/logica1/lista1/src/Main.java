import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Elaborar um algoritmo que leia um número, some ao seu valor o número cinco
        //e exiba o resultado da operação.
        Scanner Ler = new Scanner(System.in);
        int num;
        int num2;
        int num3;
        int num4;

//        System.out.println("Digite um numero: ");
//        num = Ler.nextInt();
//        int soma = num + 5;
//
//        System.out.println(soma);

        //2. Descreva um algoritmo que leia um número, subtraia do seu valor o numero
        //três, multiplique por dois e exiba o resultado
//        System.out.println("Digite um numero: ");
//        num = Ler.nextInt();
//        int subtracao = num - 3;
//        int multiplicacao = subtracao * 2;
//        System.out.println(multiplicacao);

        //3. Crie um algoritmo que leia dois numero, some o número dois aos valores lidos,
        //e mostre os valores resultantes.
//        System.out.println("Digite um numero: ");
//        num = Ler.nextInt();
//        System.out.println("Digite outro numero: ");
//        num2 = Ler.nextInt();
//
//        int soma1 = num + 2;
//        int soma2 = num2 + 2;
//
//        System.out.println(soma1);
//        System.out.println(soma2);

        //5. Crie um algoritmo que leia dois números, subtraia os seus valores (num1-num2)
        //, some ao resultado o número 10 e mostre o valor da operação em vídeo.
//        System.out.print("digite um numero: ");
//        num = Ler.nextInt();
//        System.out.print("digite outro numero: ");
//        num2 = Ler.nextInt();
//
//        int tirando = num - num2;
//        tirando += 10;
//
//        System.out.println(tirando);

        //6. Descreva um algoritmo que leia um número, subtraia do seu valor o número
        //três, leia outro número e some ao seu valor o número dois, some os resultados
        //das operações realizadas com os números lidos , subtrai do resultado o número
        //1 e mostre em vídeo o valor final da operação.
        System.out.print("digite um numero: ");
        num = Ler.nextInt();
        int calc1 = num - 3;

        System.out.print("digite outro numero: ");
        num2 = Ler.nextInt();
        int calc2 = num2 + 2;

        int result = num + num2;
        int result2 = calc1 + calc2;
        int result3 = result + result2;

        result3 -= 1;

        System.out.println(result3);

    }
}