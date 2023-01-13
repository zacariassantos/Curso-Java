package arrays;

import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {
		
		int quantidadeDeNotas = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja informar ?");
		quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("digite a %d nota",i+1);
			notas[i] = entrada.nextDouble();
		}
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media =  total/notas.length;
		System.out.println("Sua media foi:" + media + "!");
		entrada.close();
	}
}
