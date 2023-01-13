package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto qualquer";
		System.out.println(c);
		
		c="outro texto";
		System.out.println(c);
		
		// a inferenicia precisa ser feita na declaração
		var e = 123;
		System.out.println(e);
	}
}
