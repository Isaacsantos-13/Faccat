package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex25 {
    static void main(String[] args) {
        // Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
        //escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
        //ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

        Scanner sc = new Scanner(System.in);

        float saldo, debito, credito, saldoAtual, numeroConta;

        System.out.println("Digite o número da sua conta: ");
        numeroConta = sc.nextFloat();
        System.out.println("Digite o seu saldo: ");
        saldo = sc.nextFloat();
        System.out.println("Digite o seu total de Débitos: ");
        debito = sc.nextFloat();
        System.out.println("Digite o seu total de Créditos: ");
        credito = sc.nextFloat();

        saldoAtual = saldo - debito + credito;

        if(saldoAtual < 0){
            System.out.printf("Seu saldo atual: %.2f\n Saldo Negativo", saldoAtual);
        }else{
            System.out.printf("Seu saldo atual: %.2f\n Saldo Positivo", saldoAtual);
        }

    }
}
