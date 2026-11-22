package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex07 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos completos você tem? ");
        byte idadeAnos = scanner.nextByte();
        System.out.printf("%d anos e quantos meses?", idadeAnos);
        byte idadeMeses = scanner.nextByte();
        System.out.printf("%d anos, %d meses e quantos dias?", idadeAnos, idadeMeses);
        byte dias = scanner.nextByte();

       System.out.printf("%d anos, %d meses e %d dias de vida \n", idadeAnos, idadeMeses, dias);

        int idadeEmDias =  idadeMeses * 30 +  idadeAnos * 365 + dias;

        System.out.println("Idade aproximada expressa em dias: " + idadeEmDias);
        scanner.close();
    }
}

