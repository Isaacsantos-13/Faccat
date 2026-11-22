package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex15 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        float numeroDigitado;

        System.out.println("Digite o número: ");
        numeroDigitado = scanner.nextFloat();
        if(numeroDigitado < 0){
            System.out.println("O número é negativo.");
        }else{
            System.out.println("O número é positivo.");
        }
    }
}
