package Controle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Imforme a média ");
		double media = entrada.nextDouble();
		
		if (media<= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabens");
		}
		if(media < 7 && media >= 4.5)
			System.out.println("Recuperação");
		
		boolean criterioReprovadoAtingido = media < 4.5 && media >=0;
		if (criterioReprovadoAtingido) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}
