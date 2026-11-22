package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex18 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual = 2026, anoNascimento, subtracao;
        String resultado;

        System.out.println("Digite o ano que você nasceu: ");
        anoNascimento = sc.nextInt();

        subtracao = anoAtual - anoNascimento;
        resultado = subtracao >= 16 ? "Pode votar!" : "Não pode votar!";
        System.out.println(resultado);
    }


}
