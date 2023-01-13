package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		double Cel;
		
		final double AJUSTE = 32;
		
		final double FATOR = 5/9.0;
		
		double F = 86;
		Cel = ((F - AJUSTE) * FATOR);
		System.out.println("A temperatura em Celsius e: "+ Cel);
		
		F = 150;
		Cel = ((F - AJUSTE) * FATOR);
		System.out.println("A temperatura em Celsius e: "+ Cel);
		
	}
}
