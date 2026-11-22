package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex05 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numeroDigitado = scanner.nextInt();
        int antecessor = numeroDigitado - 1;

        System.out.println("flamingo.java.aprendendo.faccat.Antecessor: " + antecessor);
    }
}
