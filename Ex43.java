package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String mens;

        System.out.println("Digite o primeiro lado:");
        a = sc.nextInt();
        System.out.println("Digite o segundo lado:");
        b = sc.nextInt();
        System.out.println("Digite o terceiro lado:");
        c = sc.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                mens = "Triangulo Equilatero";
            } else if (a == b || b == c || a == c) {
                mens = "Triangulo Isósceles";
            } else {
                mens = "Triângulo Escaleno";
            }
        } else {
            mens = "Não é possível formar um triangulo";
        }
        System.out.println(mens);
        sc.close();
    }
}