package src;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PercorrerUmaCollection {

	public static void main(String[] args) {

		// Aprendemos a percorrer uma Collection em Java 8 usando o método forEach.
		// Vejamos um exemplo:
		Set<String> conjunto = new HashSet<>();
		conjunto.add("A");
		conjunto.add("A"); // não adiciona, já existe
		conjunto.add("B");

		conjunto.forEach(letra -> {
			System.out.println(letra);
		});

		// Antes do Java 8 usávamos:
		for (String letra : conjunto) {
			System.out.println(letra);
		}

		/**
		 * No entanto, voltando ao passo mais longínquo, mais propriamente antes do Java
		 * 5, essa estrutura não existia. Se não existia, como era possível iterar em um
		 * conjunto (Set) se ele não possui acesso indexado como uma lista que possui o
		 * método get? Percorríamos uma lista através de um Iterator! É um objeto que
		 * todas as coleções nos dão acesso e serve para iterar entre os objetos dentro
		 * da coleção. A ordem na qual os elementos são devolvidos pelo Iterator depende
		 * da implementação da Collection utilizada.
		 * 
		 * Vejamos um exemplo:
		 */
		Curso javaColecoes = new Curso();
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}

}

class Aluno{
	
}

class Curso{
	
	private Set<Aluno> alunos = new HashSet<>(); 
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
}
