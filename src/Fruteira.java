package src;

import java.util.Scanner;

public class Fruteira {

    /*
	22) Uma fruteira está vendendo frutas com a seguinte tabela de preços:

        Até 5 Kg                            Acima de 5 Kg
        Morango  R$ 2,50 por Kg             R$ 2,20 por Kg
        Maçã     R$ 1,80 por Kg             R$ 1,50 por Kg

        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
        compra ultrapassar R$ 25,00, receberá ainda um desconto de
        10% sobre este total. Escreva um algoritmo para ler a
        quantidade (em Kg) de morangos e a quantidade (em Kg) de
        maças adquiridas e escreva o valor a ser pago pelo cliente.
	 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade (kg) de morango:");
        double qtdMorango = scan.nextDouble();

        System.out.println("Entre com a quantidade (kg) de maça:");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango = 0;
        if (qtdMorango <= 5) {
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;
        if (qtdMaca <= 5) {
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }

        // Ajustes daqui para baixo!!!
        double precoTotal = precoKgMorango + precoKgMaca;

        // Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
        // compra ultrapassar R$ 25,00, receberá ainda um desconto de
        // 10% sobre este total
        if ((qtdMorango + qtdMaca > 8) || precoTotal > 25) {
            precoTotal = precoTotal - ((precoTotal / 100) * 10);
        }

        System.out.println("Preco total = " + precoTotal);

        scan.close();
    }

}
