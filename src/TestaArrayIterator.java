package src;

import java.util.ArrayList;
import java.util.Iterator;

public class TestaArrayIterator {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("C#");
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			String atual = it.next();
			System.out.println(atual);
		}
		
	}
	
}
