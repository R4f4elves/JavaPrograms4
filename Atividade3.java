package JavaLista4;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Informe o lado A: ");
        double a = sc.nextDouble();
        System.out.print("Informe o lado B: ");
        double b = sc.nextDouble();
        System.out.print("Informe o lado C: ");
        double c = sc.nextDouble();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.print("Os lados formam um triângulo ");
            if (a == b && b == c) {
                System.out.println("EQUILÁTERO, todos os lados iguais.");
            } else if (a == b || a == c || b == c) {
                System.out.println("ISÓSCELES, dois lados iguais.");
            } else {
                System.out.println("ESCALENO, todos os lados diferentes.");
            }
        } else {
            System.out.println("Os lados informados NÃO PODEM formar um triângulo.");
        }
        sc.close();
    }
}

