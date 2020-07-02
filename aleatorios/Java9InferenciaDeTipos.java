package aleatorios;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Java9InferenciaDeTipos {

	public static void main(String[] args) {

		// Versão anterior
		Map<String, String> diamondOperatorSyntaxSugar = new HashMap<String, String>();
		
		// Java 7
		Map<String, String> diamondOperatorJava7 = new HashMap<>();
		
		// Java 8
		// Expressão Lambda
		// Apesar de ser possível, em nenhum momento precisamos declarar que a variável s da expressão lambda era do tipo String.
		// Estamos ordenando uma lista que é do tipo String, portanto isso foi inferido automaticamente.
//		palavras.sort(comparing(s -> s.length());
		
		// Java 9
		// A possível inferência de variáveis locais do Java 9
		var palavras = new ArrayList<String>();
		var nome = "Rodrigo Turini";
		var count = 10;
//		var path = Path.of(fileName);
//		var fileStream = new FileInputStream(path);
//		var bytes = Files.readAllBytes(fileStream);
		
	}

}
