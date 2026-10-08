package JavaLista4;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        int comeco, fim, cont, cont2;
        System.out.println("escreva as horas do começo do jogo: ");
        Scanner sc = new Scanner(System.in);
        comeco = sc.nextInt();
        System.out.println("escreva as horas do termino do jogo: ");
        fim = sc.nextInt();
        if (fim > comeco) {
            cont = fim - comeco;
            System.out.println("acabou no dia seguinte");
            System.out.println("o jogo durou: " + cont+" horas");
        } else if (fim < comeco) {
            cont2 = (24-comeco)+fim;
            System.out.println("jogo terminado: ");
            System.out.println("o jogo durou: " + cont2+" horas");
        }
    }
}
