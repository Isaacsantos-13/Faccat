package flamingo.java.aprendendo.faccat;

import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "° número: ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Ordem crescente: " + Arrays.toString(numeros));



    }
}
