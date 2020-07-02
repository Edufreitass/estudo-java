package aleatorios;

public class PessoaEncapsulada{

	private String nome;
	private String sobrenome;

	public PessoaEncapsulada(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	/* 
		ENCAPSULAMENTO:
		- Não é só colocar PRIVATE nas variaveis, é realmente encapsular o comportamento.
		- Perceba na classe Teste, ela não sabe como a impressão do nome é feita, ela não
		sabe como impressão do nome é feita, ela nao sabe como se calcula o valor do nome completo,
		ela nao sabe se esta armazenado em uma variavel, em duas ou em dez, ela nao tem esse conhecimento.
		- Isso é bom, por que? 
		- Pois toda vez que você trocar a maneira de como o nome é armazenado ou como a concatenação é feita,
		eu não preciso alterar a classe Teste, encapsulamento é uma maneira ótima, um código bem encapsulado tende
		a ter um custo de manutenção muito menor, porque as mudanças são locais e elas se propagam no sistema inteiro,
		sem quebrar o sistemas inteiro, então não há necessidade de dar manutenção em todo o código.
		- Então encapsulamento é um conceito muito importante, é sobre você esconder os detalhes de implementação,
		até mesmo das classes que usem, apenas quem conhece esses detalhes tem que ser o componente especializado.
		- Se esse comportamento vaza para o sistema, vaza para classes quem não tem nada a ver com a história, o que acontece é,
		você mexeu em um lugar, acaba afetando outro também.
	*/
	public String getNomeCompleto(){
		return this.nome + " " + this.sobrenome;
	}

}