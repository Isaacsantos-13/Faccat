package flamingo.java.aprendendo.faccat;

import java.util.Arrays;
import java.util.Scanner;

public class Ex20 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor01, valor02, asc;

        System.out.println("Digite o primeiro valor: ");
        valor01 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor02 = sc.nextInt();

        if(valor01 < valor02){
            System.out.println(valor01 + ", " + valor02);
        }else{
            System.out.println(valor02 + ", " + valor01);
        }

    }
}
