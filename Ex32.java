package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex32 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] times = new String[2];
        int[] gols = new int[2];

        for (int i = 0; i < times.length; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º time: ");
            times[i] = sc.nextLine();

            System.out.println("Digite quantos gols o time " + times[i] + " fez na partida:");
            gols[i] = Integer.parseInt(sc.nextLine());

        }

        if(gols[0] > gols[1]){
            System.out.println(times[0] + " ganhou.");
        }
        else if(gols[1] > gols[0]){
            System.out.println(times[1] + " ganhou.");
        }else{
            System.out.println("Empate.");
        }
    }
}