package rascunho;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		// Antes do Java 8 um cenário normalmente encontrado, era ter uma lista populada e percorrer usando um looping com um for.
		List<Integer> itens = Arrays.asList(11, 10, 16, 5, 85);
		
		System.out.println("Primeiro exemplo");
		for(Integer item : itens) {
			System.out.println(item);
		}
		// Obs: Este exemplo apenas imprime todos os elementos da lista de itens.
		
		System.out.println("------------------------------------------------");
		
		// Seguindo nesta ideia, após o Java 8, podemos escrever este mesmo exemplo da seguinte forma:
		List<Integer> itens1 = Arrays.asList(85, 5, 16, 10, 11);
		
		System.out.println("Segundo exemplo");
		itens1.forEach(item->System.out.println(item));
		
		System.out.println("------------------------------------------------");
		
		// Dessa maneira já podemos ver que esta bem mais fácil, mas ainda podemos melhorar este código usando o recurso também adicionado ao Java 8, method reference:
		List<Integer> itens2 = Arrays.asList(5, 10, 85, 11, 16);
		System.out.println("Terceiro exemplo");
		itens2.forEach(System.out::println);
		
		System.out.println("------------------------------------------------");
		
		// Filtrar itens de List usando Java 8 e lambda
		
		// Um dos objetivos é permitir filtrar itens de uma maneira mais fácil de ler e entender, veja:
		List<Integer> itens3 = Arrays.asList( 11, 10, 16, 5, 85 );

		for(Integer item : itens3){
		    if ( item == 16 )
		        System.out.println(item);
		}
		
		System.out.println("------------------------------------------------");
		
		// Fazendo isso usando java 8, lambda e stream, podemos escrever assim:
		
		List<Integer> itens4 = Arrays.asList( 11, 10, 16, 5, 85 );

		itens4.stream().filter(i -> i == 16).forEach(System.out::println);
		
		System.out.println("------------------------------------------------");
		
		// Filtrando os itens maiores que 20
		
		// Você poderia escrever tranquilamente assim:
		List<Integer> itens5 = Arrays.asList( 11, 10, 16, 5, 85 );

		for(Integer item : itens5){
		    if ( item > 16 )
		        System.out.println(item);
		}
		
		System.out.println("------------------------------------------------");
		
		// Mas usando java 8, lambda e stream, podemos escrever assim:
		List<Integer> itens6 = Arrays.asList( 11, 10, 16, 5, 85 );

		itens6.stream().filter(i -> i > 16).forEach(System.out::println);
		
	}

}
