package JavaLista4;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Informe o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Informe o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Informe o terceiro número: ");
        double num3 = sc.nextDouble();
        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos os números são iguais.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
        sc.close();
    }
}
