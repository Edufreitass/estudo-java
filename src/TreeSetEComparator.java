package src;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEComparator implements Comparator<Funcionario> {

	/**
	 * Crie uma classe que implemente a interface Comparator usando como critério de
	 * comparação a idade de funcionários. Crie três funcionários adicionando-os em
	 * um TreeSet. Em seguida, itere sobre a lista usando um Iterator para imprimir
	 * o nome de cada funcionário.
	 */

	@Override
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
		return funcionario.getIdade() - outroFuncionario.getIdade();
	}

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Barney", 12);
		Funcionario f2 = new Funcionario("Jonatan", 9);
		Funcionario f3 = new Funcionario("Guaraciara", 13);

		Set<Funcionario> funcionarios = new TreeSet<>(new TreeSetEComparator());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);

		Iterator<Funcionario> iterador = funcionarios.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}
	}

}

class Funcionario {

	private String nome;
	private int idade;

	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
