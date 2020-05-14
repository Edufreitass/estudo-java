package rascunho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Java 11 avançado", 30);
		Aula a2 = new Aula("Flutter para iniciantes", 15);
		Aula a3 = new Aula("C++ o guia completo", 42);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
		
		Collections.sort( aulas);
		System.out.println("Ordenando pelo TITULO = " + aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println("Ordenando pelo TEMPO = " + aulas);
		
	}

}

class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aula [titulo=" + this.titulo + ", tempo=" + this.tempo + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
}