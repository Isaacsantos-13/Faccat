package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex14 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        float numeroDigitado;

        System.out.println("Digite o número: ");
        numeroDigitado = scanner.nextFloat();
        if (numeroDigitado < 10){
            System.out.println("NÃO É MAIOR QUE 10!");
        }else if(numeroDigitado > 10){
            System.out.println("É MAIOR QUE 10!");
        }else{
            System.out.println("O NÚMERO É 10!");
        }
    }
}
