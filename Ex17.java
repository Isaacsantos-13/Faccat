package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex17 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        float nota, soma = 0, media;
        String resultado;

        for(int i = 1; i < 3; i++) {
            System.out.printf("Digite a %da nota: ", i);
            nota = scanner.nextFloat();
            soma += nota;
        }

        media = soma / 2;
        System.out.println("Media: " + media);

        resultado = media >= 6 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        /* if(media >= 6){
            System.out.println("Aprovado! ");
        }else{
            System.out.println("Reprovado.");
        } */

    }
}
