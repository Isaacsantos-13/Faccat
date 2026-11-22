package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex34 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z;
        char resposta;

        System.out.println("Digite o valor de X:");
        x = sc.nextInt();

        System.out.println("Digite o valor de Y:");
        y = sc.nextInt();

        z = (x * y) + 5;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println("Z = " + z);
        System.out.println("Resposta = " + resposta);

        sc.close();
    }
}
