package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produto;
        int quantidade;
        double precoUnitario, total, desconto, totalPagar;

        System.out.println("Digite o nome do produto:");
        produto = sc.nextLine();
        System.out.println("Dgite a quantidade adquirida:");
        quantidade = sc.nextInt();
        System.out.println("Digite o preço unitário:");
        precoUnitario = sc.nextDouble();

        total = quantidade * precoUnitario;
        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        totalPagar = total - desconto;
        System.out.println("Produto: " + produto);
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);
        sc.close();
    }
}