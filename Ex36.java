package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int homem01, homem02, mulher01, mulher02;
        int homemMaisVelho, homemMaisNovo, mulherMaisVelha, mulherMaisNova;
        int soma, produto;

        System.out.println("Digite a idade do primeiro homem:");
        homem01 = sc.nextInt();

        System.out.println("Digite a idade do segundo homem:");
        homem02 = sc.nextInt();

        System.out.println("Digite a idade da primeira mulher:");
        mulher01 = sc.nextInt();

        System.out.println("Digite a idade da segunda mulher:");
        mulher02 = sc.nextInt();

        if (homem01 > homem02) {
            homemMaisVelho = homem01;
            homemMaisNovo = homem02;
        } else {
            homemMaisVelho = homem02;
            homemMaisNovo = homem01;
        }

        if (mulher01 > mulher02) {
            mulherMaisVelha = mulher01;
            mulherMaisNova = mulher02;
        } else {
            mulherMaisVelha = mulher02;
            mulherMaisNova = mulher01;
        }

        soma = homemMaisVelho + mulherMaisNova;
        produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma das idades do homem mais velho e da mulher mais nova: " + soma);
        System.out.println("Produto das idades do homem mais novo e da mulher mais velha: " + produto);

        sc.close();
    }
}
