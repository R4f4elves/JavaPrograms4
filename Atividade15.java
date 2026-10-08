package JavaLista4;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        int dia, mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o dia de nascimento: ");
        dia = sc.nextInt();
        System.out.println("Informe o mês de nascimento (em número): ");
        mes = sc.nextInt();
        if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
            System.out.println("Você é do signo de Áries!");
        } else {
            System.out.println("Você não é do signo de Áries.");
        }
        sc.close();
    }
}

