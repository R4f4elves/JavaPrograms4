package JavaLista4;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        double valorProd, valorFinal; // Mudei o nome para valorFinal para fazer mais sentido
        int codigo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        valorProd = sc.nextDouble();
        System.out.println("Informe o codigo de operação: ");
        System.out.println("1: À vista 10% desc;\n2: Cartão 5% desc;\n3: 2x preço normal");
        codigo = sc.nextInt();
        if (codigo == 1) {
            valorFinal = valorProd * 0.90;
            System.out.println("Seu valor com desconto aplicado é de: " + valorFinal);
        } else if (codigo == 2) {
            valorFinal = valorProd * 0.95;
            System.out.println("Seu valor com desconto no cartão é de: " + valorFinal);
        } else if (codigo == 3) {
            valorFinal = valorProd * 2;
            System.out.println("O valor total parcelado em 2x (preço normal) é de: " + valorFinal);
        } else {
            System.out.println("Código inválido!");
        }
        sc.close();
    }
}
