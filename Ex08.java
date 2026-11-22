package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex08 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        float nulos, brancos, validos, percentualNulos, percentualBrancos, percentualValidos;

        System.out.println("Votos nulos: ");
        nulos = scanner.nextInt();

        System.out.println("Votos brancos: ");
        brancos = scanner.nextInt();

        System.out.println("Votos válidos: ");
        validos = scanner.nextInt();

        float total = nulos + brancos + validos;
        percentualNulos = (nulos / total) * 100;
        percentualBrancos = (brancos / total) * 100;
        percentualValidos = (validos / total) * 100;

        System.out.printf("Votos nulos: %.2f%% \n Votos brancos: %.2f%% \n Votos validos: %.2f%%",
                percentualNulos, percentualBrancos, percentualValidos);
        scanner.close();

    }
}
