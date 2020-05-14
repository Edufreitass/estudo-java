package rascunho;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String curso1 = "Java 11: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Dart/Flutter";
		String curso3 = "Certificacao Java SE 11 Programmer I";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		System.out.println(cursos);
		
		Collections.sort(cursos);
		
		System.out.println("A lista ordenada ficará assim: " + cursos);
		
		cursos.remove(1);
		System.out.println(cursos);

		System.out.println(cursos.get(1));
		
		try {
			for (int i = 0; i <= cursos.size(); i++) {
				System.out.println("Aula : " + cursos.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println();
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
