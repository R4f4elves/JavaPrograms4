package JavaLista4;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        double num1,num2,resultado,operacao;
    System.out.println("escreva o primeiro numero:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        System.out.println("escreva o segundo nuemro:");
        num2 = sc.nextDouble();
        System.out.println("Escolha a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        operacao= sc.nextDouble();
        if (operacao == 1) {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == 2) {
            resultado = num1-num2;
            System.out.println("Resultado: "+ resultado);
        }
        if (operacao ==3 ) {
            resultado = num1 * num2;
            System.out.println("Reseultado: " + resultado);
        } else if (operacao == 4) {
            resultado = num1/num2;
            System.out.println("Resultado: "+ resultado);
        }


    }
}
