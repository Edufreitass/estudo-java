package src;

public class Rascunho {

	public static void main(String[] args) {
		
//		int resultado;
//
//		resultado = +1;
//		System.out.println(resultado);
//
//		resultado--;
//		System.out.println(resultado);
//
//		resultado++;
//		System.out.println(resultado);
//
//		resultado = -resultado;
//		System.out.println(resultado);
//		
//		boolean success = false;
//		System.out.println(success);
//		System.out.println(!success);
		
		int x;
		for(x = 1; x <= 5; x++) {
			if(x % 3 == 0 && x % 5 == 0) {
				System.out.println(x + 2);
			} else {
				System.out.println(x + 1);
			}
		}

	}

}
