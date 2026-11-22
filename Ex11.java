package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        float salarioFixo, totalVendas, comissaoPorCarro, comissaoTotalCarros, adicionalVendas, salarioFinal;
        int carrosVendidos;

        System.out.println("Seu salário fixo: ");
        salarioFixo = scanner.nextFloat();

        System.out.println("Total de carros vendidos: ");
        carrosVendidos = scanner.nextInt();

        System.out.println("Valor que você recebe por carro vendido: ");
        comissaoPorCarro = scanner.nextFloat();

        System.out.println("Valor total de vendas (em Reais): ");
        totalVendas = scanner.nextFloat();

        comissaoTotalCarros = comissaoPorCarro * carrosVendidos;
        adicionalVendas = (totalVendas / 100) * 5;
        salarioFinal = salarioFixo + comissaoTotalCarros + adicionalVendas;

        System.out.println("Salário final: " + salarioFinal);
        scanner.close();





    }
}
