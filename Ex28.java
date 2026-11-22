package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex28 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero01, numero02, numero03, maiorNumero;

        System.out.println("Digite o primeiro número: ");
        numero01 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        numero02 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        numero03 = sc.nextInt();

        if(numero01 > numero02 && numero01 > numero03){
           maiorNumero = numero01;
       }else if(numero02 > numero01 && numero02 > numero03){
           maiorNumero = numero02;
       }else{
           maiorNumero = numero03;
       }

        }
    }

