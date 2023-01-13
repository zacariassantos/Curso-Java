package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float) 1.12345678888; // explicit (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c;
		
		System.out.println(d);
	}
}
