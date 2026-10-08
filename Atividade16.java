package JavaLista4;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        int num;
        System.out.println("Informe um número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0 && num % 5 == 00) {
            System.out.println("Seu número é divisivel por 2, 3 e 5 ao mesmo tempo");
        } else {
            System.out.println("Seu número não é divisível por 2, 3 e 5");
        }
        sc.close();
    }
}
