package flamingo.java.aprendendo.faccat;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex19 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor01, valor02;

        System.out.println("Digite o primeiro valor: ");
        valor01 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor02 = sc.nextInt();

        System.out.println("Maior: " + Math.max(valor01, valor02));
    }
}
