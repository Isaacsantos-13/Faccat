package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        float grausCelsius, grausFahrenheit;

        System.out.println("Digite o valor em graus Fahrenheit: ");
        grausFahrenheit = scanner.nextFloat();

        grausCelsius = (grausFahrenheit - 32) * 5/9;

        System.out.printf("Temperatura convertida para graus Fahrenheit: %.1f°C", grausCelsius);
        scanner.close();
    }
}
