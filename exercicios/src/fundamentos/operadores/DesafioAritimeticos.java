package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		int Psuper = (int)Math.pow((6*5), 2);
		int Pinf = 3 * 2;
		int Lesq = Psuper / Pinf;
		
		int Psuper2 = (1-5)*(2-7);
		int Pinf2 = 2;
		int Ldir = Psuper2/Pinf2;
		int LdirP = (int) Math.pow(Ldir, 2);
		
		int SuperG = (int) Math.pow(Lesq-LdirP,3);
		int SuperI = (int) Math.pow(10, 3);
		
		int resultado = SuperG/SuperI;
		
		System.out.println("O resultado da expressão é:"+resultado);
		
	}
}
