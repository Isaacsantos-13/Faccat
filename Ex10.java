package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        float custoFabrica, valorFinal, percentualDistribuidor, percentualImpostos;

        System.out.println("Digite o custo de fábrica do carro: ");
        custoFabrica = scanner.nextFloat();

        percentualDistribuidor = (28f / 100) * custoFabrica;
        percentualImpostos = (45f / 100) * custoFabrica;

        valorFinal = custoFabrica + percentualDistribuidor + percentualImpostos;
        System.out.printf("Valor final: %.2f", valorFinal);

    }
}
