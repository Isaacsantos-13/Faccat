package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double litros, precoLitro, desconto, total, valorPagar;
        char tipo;

        System.out.println("Digite a quantidade de litros:");
        litros = sc.nextDouble();
        System.out.println("Digite o tipo de combustível (A para álcool ou G para gasolina):");
        tipo = Character.toUpperCase(sc.next().charAt(0));

        if (tipo == 'A') {
            precoLitro = 2.90;

            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = 3.30;

            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            sc.close();
            return;
        }
        total = litros * precoLitro;
        valorPagar = total - (total * desconto);

        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);
        sc.close();
    }
}


