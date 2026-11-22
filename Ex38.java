package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, senha;

        System.out.println("Digite o código de usuario:");
        codigo = sc.nextInt();
        if (codigo == 1234) {
            System.out.println("Digite a senha:");
            senha = sc.nextInt();

            if (senha == 9999) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("senha incorreta");
            }
        } else {
            System.out.println("Usuario invalido!");
        }

        sc.close();
    }
}
