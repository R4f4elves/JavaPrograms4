package JavaLista4;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        int num, primeirosDois, ultimosDois, soma, quadrado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número de 4 dígitos: ");
        num = sc.nextInt();
        primeirosDois = num / 100;
        ultimosDois = num % 100;
        soma = primeirosDois + ultimosDois;
        quadrado = soma * soma;
        if (quadrado == num) {
            System.out.println("O número " + num + " é um Número Mágico!");
        } else {
            System.out.println("O número " + num + " não possui essa característica especiais.");
        }
        sc.close();
    }
}

