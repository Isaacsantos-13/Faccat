package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kgMorango, kgMaca, precoMorango, precoMaca, total;

        System.out.println("Digite a quantidade de morangos em kg:");
        kgMorango = sc.nextDouble();
        System.out.println("Digite a quantidade de maçãs em kg:");
        kgMaca = sc.nextDouble();

        if (kgMorango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        total = kgMorango * precoMorango + kgMaca * precoMaca;
        if (kgMorango + kgMaca > 8 || total > 25.00) {
            total = total - (total * 0.10);
        }
        System.out.printf("Valor a pagar: R$ %.2f%n", total);
        sc.close();
    }
}
