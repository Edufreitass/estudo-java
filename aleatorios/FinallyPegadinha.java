package aleatorios;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for(int i=0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			} 
			catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0); // esse metodo encerra o programa
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posicao do array invalida");
				System.exit(0);
			}
			finally {
				System.out.println("Essa linha e impressa sempre apos o try ou catch");
				System.out.println();
			}
			
		}
		
	}
	
}
