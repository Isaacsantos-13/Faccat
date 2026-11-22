package flamingo.java.aprendendo.faccat;

import java.time.Year;
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, anoNascimento, anoIngresso, anoAtual, idade, tempoTrabalho;

        System.out.println("Digite o código do empregado:");
        codigo = sc.nextInt();

        System.out.println("Digite o ano de nascimento:");
        anoNascimento = sc.nextInt();

        System.out.println("Digite o ano de ingresso na empresa:");
        anoIngresso = sc.nextInt();

        anoAtual = Year.now().getValue();
        idade = anoAtual - anoNascimento;
        tempoTrabalho = anoAtual - anoIngresso;

        System.out.println("Código do empregado: " + codigo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Temp de trabalho: " + tempoTrabalho + " anos");

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }
        sc.close();
    }
}