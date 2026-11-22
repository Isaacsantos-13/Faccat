package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex53 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n;
            System.out.println("Digite o valor N: ");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Digite um valor maior que zero.");
            }else{
                for(int i = 1; i <= n; i++){
                    System.out.println(i);
                }
        }
    }
}
