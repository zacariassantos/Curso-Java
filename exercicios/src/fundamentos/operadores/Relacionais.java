package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a'; // se colocar em hexadecimal é igual
		
		System.out.println(a==b);
		System.out.println(3>4);
		System.out.println(3>=4);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean bomcomportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomcomportamento && passouPorMedia;
		System.out.println("Tem Desconto? "+ temDesconto);
	}
}
