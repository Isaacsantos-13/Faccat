package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex22 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valorHora, totalHorasTrabalhadas, salarioTotal, salario, horasExtras, valorHoraExtra;

        System.out.println("Digite o valor da sua hora trabalhada: ");
        valorHora = sc.nextFloat();
        System.out.println("Digite o seu total de horas trabalhadas esse mês: ");
        totalHorasTrabalhadas = sc.nextFloat();

        horasExtras = totalHorasTrabalhadas - 40;
        valorHoraExtra = valorHora + (valorHora / 100) * 50;
        salario = valorHora * totalHorasTrabalhadas;

        if(totalHorasTrabalhadas <= 40){
            System.out.println("Total a receber: " + salario);
        }else{
            salarioTotal = (valorHora * 40) + (valorHoraExtra * horasExtras);
            System.out.println("Total a receber: " + salarioTotal);
        }
    }
}
