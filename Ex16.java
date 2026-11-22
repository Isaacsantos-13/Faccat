package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex16 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        float quantiaMacas, valorMaca;

        System.out.println("Digite quantas Maçãs você deseja: ");
        quantiaMacas = scanner.nextFloat();
        if(quantiaMacas < 12 && quantiaMacas > 0){
            valorMaca = quantiaMacas * 1.30f;
            System.out.printf("Valor da compra: R$ %.2f", valorMaca);
        } else if (quantiaMacas >= 12) {
            System.out.printf("Valor da compra: R$ %.2f", quantiaMacas);
        }else{
            System.out.println("Valor inválido.");
            scanner.close();
        }
    }
}
