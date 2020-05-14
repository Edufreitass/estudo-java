package rascunho;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {

		Set<String> nomes = Collections.emptySet();
		nomes.add("Paulo"); // O que acontence aqui?
		// Imprime java.lang.UnsupportedOperationException
		System.out.println(nomes);
		
	}

}
