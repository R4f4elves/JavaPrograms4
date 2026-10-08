package JavaLista4;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        int num;
        System.out.println("escreva um numero para ver se ele multiplo de 7 ou 11");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        if (num % 7 == 0 || num % 11 == 0) {
            System.out.println("É um numero multiplo de 11 ou 7");
        } else {
            System.out.println("Nao é multiplo de nenum dos dois!");
        }
    }
}
