package aleatorios;

public class ErroLambda {

	/*
	 * o erro que está acontecendo é esse: variable used in lambda expression should be final or effectively final
	 * traduzindo para o português seria: uma variável usada em uma expressão lambda deve ser final, ou efetivamente final
	 * uma variável final, significa que ela só pode ser instanciada uma única vez, ou seja, não pode ter o seu valor alterado
	 * durante a execução do código, nesse código a variável i está sendo constantemente modificada, a cada execução do seu for.
	 * a explicação do porque uma variável dentro de uma expressão lambda precisa ser final envolve o modelo que java usa para 
	 * memória o qual garante que uma variável local nunca pode ser escrita ou modificada por uma outra thread
	 */
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			// erro no "(i)"
//			new Thread(() -> System.out.println(i)).start();
		}
		
	}
	
}
