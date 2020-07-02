package aleatorios;

public class TestaCicloDeVida {

public static void main(String[] args) {
	Carro c = new Carro();
	c.modelo = "Camaro";
	c.ano = 2021;
	
	c = new Carro();
	c.ano = 2000;

	c = new Carro();
	System.out.println(c.ano);
	
	Carro c3;
	for (int i = 0; i < 10; i++) {
		c3 = new Carro();
	}
	
}
	
}
