package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex24 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salarioFixo, valorVendasEfetuadas, salarioTotal = 0, vendasAcima, porcentagem01, porcentagem02;
        porcentagem01=0;

        System.out.println("Digite o seu salário fixo: ");
        salarioFixo = sc.nextFloat();
        System.out.println("Digite o valor total das suas vendas efetuadas: ");
        valorVendasEfetuadas = sc.nextFloat();

        vendasAcima = valorVendasEfetuadas - 1500;
        porcentagem02 = vendasAcima * 5 / 100;

        if(valorVendasEfetuadas <= 1500){
            porcentagem01 = valorVendasEfetuadas * 3 / 100;
            salarioTotal = salarioFixo + porcentagem01;
        }else{
            porcentagem01 = 1500f * 3 / 100;
            salarioTotal = salarioFixo + porcentagem01 + porcentagem02;
        }

        System.out.printf("Salário total: R$ %.2f", salarioTotal);
    }
}
