package aleatorios;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random num = new Random();
		
		// Gera números aleatórios sem intervalo
		int n1 = num.nextInt();
		System.out.println("O número gerado foi: " + n1);
		
		// De 0 até 20
		int n2 = num.nextInt(21);
		System.out.println("O número gerado foi: " +  n2);
		
		// De 0 até 40
		int n3 = 5 + num.nextInt(36);
		System.out.println("O número gerado foi: " +  n3);
		
		// De 0 até 40
		int n4 = num.nextInt(36) + 5;
		System.out.println("O número gerado foi: " +  n4);
		
		// De 5 até 35
		int n5 = num.nextInt(36 - 5) + 5;
		System.out.println("O número gerado foi: " + n5);
		
		// Usando uma função que contem parametros que serão os intervalos dos numeros gerados
		int n6 = numIntervalo(000000, 999999);
		System.out.println("O número gerado foi: " +  n6);
		
	}
	
	// Método/função que recebe 2 param, start = 000000 e finish = 999999
	public static int numIntervalo(int start, int finish) {
		
		Random num = new Random();
		int intervalo = num.nextInt(finish + 1 - start) + start;
		return intervalo;
		
	}
	
	// Esse método/função é o mesmo apresentado acima, porém feito de forma mais resumida.
	/* public static int numIntervalo(int start, int finish) {
		
		return (
			new Random().nextInt(finish + 1 - start) + start
		);
	} */

}
