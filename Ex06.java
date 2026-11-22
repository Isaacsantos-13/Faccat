package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex06 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo: ");
        float baseRetangulo = scanner.nextFloat();

        System.out.println("Digite o valor da altura do retângulo : ");
        float alturaRetangulo = scanner.nextFloat();

        float areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println("Área do retângulo: " + areaRetangulo);
    }
}
