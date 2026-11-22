package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex29 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero01, numero02, numero03, menorNumero, soma;

        System.out.println("Digite o primeiro número: ");
        numero01 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        numero02 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        numero03 = sc.nextInt();

        if(numero01 < numero02 && numero01 < numero02){
            menorNumero = numero01;
        }else if(numero02 < numero01 && numero02 < numero03){
            menorNumero = numero02;
        }else{
            menorNumero = numero03;
        }

        soma = numero01 + numero02 + numero03 - menorNumero;

        System.out.println("A soma dos dois maiores é: " + soma);

    }
}
