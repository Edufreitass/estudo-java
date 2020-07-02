package aleatorios;

public class Duvida01 {

	public static void main(String[] args) {

		B x = new B();
		B y = x; // 15
		y.v++; // 16
		x.v++; // 16
		B z = y; // 17
		z.v--; // 16
		// 16 + 16 + 16
		// 32 + 16
		// 48
		System.out.println(x.v + y.v + z.v);
		
	}

}

class B {
	int v = 15;
}

/*
		z = y
		y = x
		x = v
*/