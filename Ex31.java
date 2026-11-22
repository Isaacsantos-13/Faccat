package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex31 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lados = new int[3];

        for (int i = 0; i < lados.length; i++){
            System.out.println("Digite o valor do " + (i + 1) + "° lado");
            lados[i] = sc.nextInt();
        }

        if(lados[0] + lados[1] > lados[2] && lados[0] + lados[2] > lados[1] && lados[1] + lados[2] > lados[0]){
            System.out.println("É um triângulo!");
        }else {
            System.out.println("Não é um triângulo.");
        }

        sc.close();
    }
}
