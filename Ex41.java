package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, mediaExercicios, mediaAproveitamento;
        char conceito;

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = sc.nextDouble();

        System.out.println("Digite a média dos exercicios:");
        mediaExercicios = sc.nextDouble();

        mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;
        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 7.5) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 6.0) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }

        System.out.printf("Média de aproveitamento: %.2f%n", mediaAproveitamento);
        System.out.println("conceito: " + conceito);
        sc.close();
    }
}