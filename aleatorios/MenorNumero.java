package aleatorios;

import java.util.Scanner;

public class MenorNumero {

    // Faça um programa que leia 5 números e informe o menor número.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < 5; i++) {

            System.out.println("Entre com um número:");
            num = scan.nextInt();

            if(num < menor) {
                menor = num;
                System.out.println("O menor número mudou: " + menor);
            }

        }

        System.out.println("O menor número é: " + menor);

        scan.close();
    }

}
