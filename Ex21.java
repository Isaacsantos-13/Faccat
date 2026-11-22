package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex21 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicioJogo, finalJogo, duracao;
        double tempoTotal = 0;

        System.out.println("Digite o horário que iniciou o jogo: ");
        inicioJogo = sc.nextInt();
        System.out.println("Digite o horário que o jogo terminou: ");
        finalJogo = sc.nextInt();

        if(inicioJogo < finalJogo){
            duracao = inicioJogo - finalJogo;
        }else{
            duracao = (24 - inicioJogo) + finalJogo;
        }
        System.out.println(duracao);




    }
}
