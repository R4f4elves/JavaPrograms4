package JavaLista4;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        int num;
        System.out.println("Informe um número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0 && num <= 100) {
            System.out.println("Seu número é par e menor que 100!");
        } else if (num % 2 != 0 && num > 100) {
            System.out.println("Seu número é ímapar e maior do que 100");
        }
        sc.close();
    }
}
