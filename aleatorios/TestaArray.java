package aleatorios;

public class TestaArray {

	public static void main(String[] args) {
		
		int[] idades = {0,2,4,6,8};
		
		// atribuir o valor 10 na posição(index) 4.
		idades[4] = 10;
		
		System.out.println(idades.length);
		
		// Laço para percorrer o array todo
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		// foreach do Java 5 em diante
		// Para cada inteiro idade, presente, que esta em um array chamado IDADES
		// imprime para mim, idade. Esse foreach só funciona como forma de LEITURA!
		for (int idade : idades) {
			System.out.println(idade);
		}
		
	}

}
