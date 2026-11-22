package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex27 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado;

        System.out.println("Digite um número: ");
        numeroDigitado = sc.nextInt();

        if(numeroDigitado > 0){
            System.out.println("O número é positivo!");
        }else if(numeroDigitado < 0){
            System.out.println("O número é negativo");
        }else{
            System.out.println("O número digitado é zero.");
        }
    }
}
