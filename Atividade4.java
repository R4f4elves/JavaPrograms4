package JavaLista4;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();
        if (idade < 5) {
            System.out.println("Idade muito jovem para as categorias.");
        } else if (idade <= 7) {
            System.out.println("Infantil");
        } else if (idade <= 17) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Sênior");
        }
        sc.close();
    }
}

