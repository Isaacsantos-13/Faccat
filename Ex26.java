package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex26 {
    static void main(String[] args) {
        // Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
        //quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
        //média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
        //a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
        //compra'.

        Scanner sc = new Scanner(System.in);

        int qtdAtual, qtdMinima, qtdMaxima, qtdMedia;

        System.out.println("Digite a quantidade atual no estoque: ");
        qtdAtual = sc.nextInt();
        System.out.println("Digite a quantidade máxima que o produto pode atingir: ");
        qtdMaxima = sc.nextInt();
        System.out.println("Digite a quantidade mínima");

    }
}
