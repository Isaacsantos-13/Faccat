package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex09 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double salario, percentualReajuste;

        System.out.println("Digite seu salário atual: ");
        salario = scanner.nextDouble();

        System.out.println("Digite o percentual de reajuste sem sinais (ex: 50): ");
        percentualReajuste = scanner.nextDouble();

        double reajuste = (percentualReajuste / 100) * salario;
        double salarioReajustado = salario + reajuste;

        System.out.printf("Salario com reajuste:R$ %.2f", salarioReajustado);
    }
}
