package aleatorios;

import java.util.Scanner;

public class CalculoFolhaDePagamento {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a qtd de horas trabalhadas: ");
		double qtdHoras = scan.nextDouble();

		double salarioBruto = valorHora * qtdHoras;

		double percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 1500 && salarioBruto <= 900) {
			percentualIR = 5;
		} else if (salarioBruto > 2500 && salarioBruto <= 900) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}

		double ir = (salarioBruto / 100) * 5;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = inss + fgts;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + ") : R$ " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%) : R$ " + ir);
		System.out.println("(-) INSS (10%) : R$ " + inss);
		System.out.println("FGTS (11%) : R$ " + fgts);
		System.out.println("Total de descontos : R$ " + totalDescontos);
		System.out.println("Salário Liquido : R$ " + salarioLiquido);

		scan.close();
	}

}
