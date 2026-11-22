package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex33 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[2];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "° número:");
            numeros[i] = sc.nextInt();
        }

        if(numeros[0] > numeros[1]){
            System.out.println("Primeiro é maior.");
        }else if(numeros[1] > numeros[0]){
            System.out.println("Segundo é maior.");
        }else {
            System.out.println("Números iguais.");
        }

        sc.close();
    }
}
