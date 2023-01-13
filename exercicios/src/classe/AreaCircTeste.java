package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.PI = 10;
		
		//a2.PI = 5;
		
		//AreaCirc.PI = 3.1415;
		
		System.out.println(a1.area());// pertence a instancia
		System.out.println(AreaCirc.area(100)); // static não precisa instancial
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
