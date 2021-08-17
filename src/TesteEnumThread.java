package src;

public class TesteEnumThread {

	public static void main(String[] args) {

		/**
		 * Qualquer aplicação um pouco mais sofisticada precisa usar alguns CONSTANTES.
		 * Exemplos clássicos são os dias da semana ou os meses do ano, o estado de botão (on/off) ou algumas cores.
		 * As enums são uma forma orientada a objetos de lidar com os constantes que a linguagem Java introduziu a partir da versão 5.
		 */
		
//		System.out.println(Thread.MAX_PRIORITY);
//		
//		Thread t = new Thread(() -> System.out.println("rodando ..."));
//		
//		t.setPriority(Thread.MAX_PRIORITY);
//		
//		t.start();
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pNor = Prioridade.NORMAL;
		Prioridade pMax = Prioridade.MAX;
		
		// Imprime o nome da constante do enum
		System.out.println(pMin.name());
		System.out.println(pNor.name());
		System.out.println(pMax.name());
		
		// Imprime a ordem de prioridade na sequencia em que foram declarados
		System.out.println(pMin.ordinal() + " " + pMin.name());
		System.out.println(pNor.ordinal() + " " + pNor.name());
		System.out.println(pMax.ordinal() + " " + pMax.name());
		
		// Imprime a ordem de prioridade PERSONALIZADA na sequencia em que foram declaradas
		System.out.println(pMin.getValor() + " " + pMin.name());
		System.out.println(pNor.getValor() + " " + pNor.name());
		System.out.println(pMax.getValor() + " " + pMax.name());
		
	}

}
