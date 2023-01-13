package OO.heranca.Desafio;

public class TesteCarro {

	public static void main(String[] args) {
		
		Ferrari c1 = new Ferrari();
		
		c1.Acelerar();
		System.out.println(c1);
		
		c1.Acelerar();
		System.out.println(c1);
		
		c1.Acelerar();
		System.out.println(c1);
		
		Carro c2 = new Civic();
		
		c2.Acelerar();
		System.out.println(c2);
		
		c2.Acelerar();
		System.out.println(c2);
		
		c2.Acelerar();
		System.out.println(c2);
		
		c2.Acelerar();
		c2.Acelerar();
		c2.Acelerar();
		System.out.println(c2);
		
	}
	
}
