package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex23 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        float altura, pesoIdeal = 0;
        char sexo;

        System.out.println("Digite o seu nome: ");
        nome = sc.next();
        System.out.println("Digite sua altura: ");
        altura = sc.nextFloat();
        System.out.println("Digite o seu sexo (F para feminino e M para masculino)");
        sexo = sc.next().charAt(0);

        if(sexo == 'M'){
            pesoIdeal = (72.7f * altura) - 58;
        }else if(sexo == 'F'){
            pesoIdeal = (62.1f * altura) - 44.7f;
        }else{
            System.out.println("Algum campo invalido.");
        }

        System.out.println("Seu peso ideal: " + pesoIdeal);
    }
}
