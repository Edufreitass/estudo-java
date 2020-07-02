package aleatorios;

import java.util.Scanner;

public class MediaDeNNotas {

    // Faça um programa que calcule o mostre a média aritmética de N notas.
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);

        // 1) Digitar o numero de notas
        System.out.println("Digite o número de notas:");
        int notas = scan.nextInt();

        // 2) Criar variáveis para somar o numero de notas, media e nota
        int soma = 0;
        double media;
        double nota;

        // 3) Criar laço de repetição para inserir N notas
        for(int i = 0; i < notas; i++) {
            System.out.println("Entre com a nota: " + (i + 1));
            nota = scan.nextDouble();

            soma += nota;
        }

        // 4) Calcular a media baseado na soma das notas
        media = soma / notas;

        // 5) Imprimir a soma das notas e das medias, de forma separada
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scan.close();
    }

}
