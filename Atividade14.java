package JavaLista4;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        double salario, imposto, salariof;
        System.out.println("informe seu salario para descobrir quanto de imposto irá pagar: ");
        Scanner sc = new Scanner(System.in);
        salario = sc.nextInt();
        if (salario <= 2000) {
            System.out.println("Não paga impostos (isento)");
        } else if (salario > 2000 && salario <= 5000) {
            imposto = salario * 0.1;
            salariof = salario - imposto;
            System.out.println("o valor do seu salário final é: " + salariof);
        }
        if (salario > 5000) {
            imposto = salario * 0.2;
            salariof = salario - imposto;
            System.out.println("o valor do seu salario final é: " + salariof);
        }
    }
}
