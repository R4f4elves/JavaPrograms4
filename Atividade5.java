package JavaLista4;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        int intervalo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        intervalo = sc.nextInt();
        if (intervalo >= 100 && intervalo <= 200) {
            System.out.println("O número ESTÁ no intervalo!!!!");
        } else {
            String mensagem = (intervalo < 100) ? "Menor que o intervalo" : "Maior que o intervalo";
            System.out.println(mensagem);
        }
        sc.close();
    }
}

