package JavaLista4;

import java.security.CodeSource;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        double lado1,lado2,lado3;
        System.out.println("Informe as 3 medidas: ");
        Scanner sc = new Scanner(System.in);
        lado1 = sc.nextDouble();
        lado2 = sc.nextDouble();
        lado3 = sc.nextDouble();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados informados PODEM formar um triângulo.");
        } else {
            System.out.println("Os lados informados NÃO PODEM formar um triângulo.");
        }

    }
}
