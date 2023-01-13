package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String palavra = "";
		
		while(!palavra.equalsIgnoreCase("Fim"))
		{
			System.out.println("Digite outra palavra:");
			palavra = entrada.nextLine();
		}
		
		
		entrada.close();
	}
}
