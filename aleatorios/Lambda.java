package aleatorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// classe
class Pessoa {
	
	// variaveis
	String nome;
	int idade;
	
	// construtor
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	// sobreescrita do metodo toString
	@Override
	public String toString() {
		return nome;
	}
}

/*
	 // Interfaces com apenas UM METODO, podem ser chamadas de interfaces funcionais
	 // e essas interfaces sao as candidatas a serem convertidos em LAMBDA.
	 // Para saber, verificar se uma interface é funcional ou não, usamos a anotação
	 // @FunctionalInterface, no qual COMPILA se for true, ou seja, uma interface funcional,
	 // e false(NAO COMPILA), se nao for uma interface funcional
	
	 // SUBSTITUIDA PELA INTERFACE PRONTA DO JAVA CHAMADA "Predicate"
	 // interface que recebe um objeto do tipo generico e devolve um booleano
	  * 
	 @FunctionalInterface
	 interface Matcher<T>{
	 boolean test(T t);
}
   

	// CLASSE REDUZIDA DENTRO DO METODO main
	// classe para ser usada junto com o filtrador
	 * 
	class MaioresDeIdade implements Predicate<Pessoa>{

	@Override
	public boolean test(Pessoa p) {
	
		// retorna true se a pessoa que o filtrador receber for maior de 18 anos
		return p.idade >= 18;
	}
	
}
*/

// classe base, ela recebe uma lista de pessoas e um predicate, ela devolve todas as pessoas que o predicate(filtro) se aplica.
class FiltradorDePessoas {
	
	// lista de pessoas e predicate
	List<Pessoa> filtra(List<Pessoa> todas, Predicate<Pessoa> predicate){
		// lista o resultado do array
		List<Pessoa> resultado = new ArrayList<>();
		// foreach que passa por todas as pessoas da lista de entrada, e para cada pessoa dessa lista,
		// eu faço um teste, se o teste retornar true, eu adiciono essa pessoa na lista de resultado.
		for (Pessoa p : todas) {
			if(predicate.test(p)) {
				resultado.add(p);
			}
		}
		// retorna o resultado
		return resultado;
	}
	
}

// Imagine que voce queira escrever um metodo, que dado uma lista e um criterio de busca, ele devolve uma lista que atende esse criterio.
public class Lambda {
 
	public static void main(String[] args) {
		// lista com 4 pessoas
		List<Pessoa> pessoas  = Arrays.asList(new Pessoa("Mario", 31),
								new Pessoa ("Guilherme", 32),
								new Pessoa("Lucas", 17),
								new Pessoa("Alex", 15));
		
		FiltradorDePessoas filtrador = new FiltradorDePessoas();
		
		/*
		 * CONVERTIDO EM LAMBDA, LOGO ABAIXO
		// interface funcional pronta do Java, que recebe um objeto do tipo generico e devolve um booleano
		Predicate<Pessoa> criterio = new Predicate<Pessoa>() {
			@Override
			public boolean test(Pessoa p) {
				// retorna true se a pessoa que o filtrador receber for maior de 18 anos
				return p.idade >= 18;
			}
		};
		*/
		
		/* 
		 * Lambda:
		 * - Sintaxe do LAMBDA
		 * - (parametros) -> { codigo }
		 * - Para usá-lo em interface, ela precisa ser uma interface funcional, contendo apenas um metodo.
		 * */
		
		// Lambda inicial
//		Predicate<Pessoa> criterio = (Pessoa p) -> { return p.idade >= 18; };
		
		// Se houve alguma forma do compilador descobrir qual é o parametro, voce nao 
		// precisa passa-lo, pois o generics do Predicate consegue identificar quem é.
//		Predicate<Pessoa> criterio = (p) -> { return p.idade >= 18; };
		
		// Se tiver apenas um parametro no metodo, nao e preciso colocar os parenteses no parametro.
//		Predicate<Pessoa> criterio = p -> { return p.idade >= 18; };
		
		// Se houve apenas uma linha de codigo, nao é preciso colocar as {} para delimitar o bloco.
//		Predicate<Pessoa> criterio = p -> return p.idade >= 18;
		
		// Se essa linha de codigo, for o retorno do metodo, nao é preciso colocar o return.
//		Predicate<Pessoa> criterio = p -> p.idade >= 18;
		
		// Lambda final
//		Predicate<Pessoa> criterio = p -> p.idade >= 18;
		
//		List<Pessoa> resultado = filtrador.filtra(pessoas, criterio);
		List<Pessoa> resultado = filtrador.filtra(pessoas, p -> p.idade >= 18);
		System.out.println(resultado);
		
		List<Pessoa> resultado2 = filtrador.filtra(pessoas, p -> p.nome.startsWith("A"));
		System.out.println(resultado2);
		
		/* 
		 * Regras do Lambda:
		 * 
		 * - Sintaxe padrão
		 * (String s1, String s2) -> { codigo };
		 * 
		 * - Se caso voce ja saiba o tipo, é possivel EMITIR os tipos.
		 * (s1, s2) -> { codigo };
		 * 
		 * - Se esse lambda receber um unico argumento
		 * p -> { codigo };
		 * 
		 * - Se nao houver NENHUM argumento, parametro, voce é OBRIGADO a colocar os parenteses.
		 * Runnable r = () -> { codigo };
		 * 
		 * - Se houver APENAS UMA linha de codigo, NAO é necessario colocar as chaves
		 * Runnable r = () -> System.out.println("msg");
		 * 
		 * - Se houver MAIS DE UMA linha de codigo, é necessario colocar as chaves
		 * Runnable r2 = () -> {
		 * 		System.out.println("msg");
		 * 		System.out.println("msg2");
		 * }
		 */
		
	}
	
}
