package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex13 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

         float primeiraNota, segundaNota, terceiraNota, mediaFinal;

         System.out.println("Digite a primeira nota: ");
        primeiraNota = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        segundaNota = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        terceiraNota = scanner.nextFloat();

        mediaFinal = (primeiraNota * 2) + (segundaNota * 3) + (terceiraNota * 5);

        System.out.printf("Media final: %.2f", mediaFinal);
        scanner.close();


    }
}
