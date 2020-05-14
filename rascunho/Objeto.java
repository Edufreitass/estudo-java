package rascunho;

public class Objeto {

	int v = 15;
	
	public static void main(String[] args) {
		
		Objeto x = new Objeto(); //
		Objeto y = x;
        y.v++; //16
        x.v++; //16
        Objeto z = y;
        z.v--; // 16
        System.out.println(x.v + y.v + z.v); //16 +	16 = 32 + 16 = 48	
        
        
        
        
        
        
        
        
        
        
//        int x = 15;
//        int y = x;
//        y++; //16
//        x++; //16
//        int z = y;
//        z--; //15
//        System.out.println(x + y + z); //32 + 15 = 
        
	}
}
