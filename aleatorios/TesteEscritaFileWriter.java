package aleatorios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	// O método System.currentTimeMillis() devolve os milissegundos que passaram desde 1 de janeiro de 1970
	
    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis();

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        bw.close();

        long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

    }
}
