package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
	System.out.print("Bom ");
	System.out.print("dia !\n");
	
	System.out.println("Bom");
	
	System.out.println("dia !");
	
	System.out.printf("Megasena: %d %d %d %d %d %n",
			1 , 2, 3, 4, 5);
	System.out.printf("Salario: %.1f%n",12000.50);
	System.out.printf("nome: %s%n","Zack");
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o seu nome");
	String nome = entrada.nextLine();

	System.out.println("Digite seu sobrenome");
	String sobrenome = entrada.nextLine();
	
	System.out.println("Digite seu sobrenome");
	int idade = entrada.nextInt(); // tem que ser int pq line retorna str
	
	System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
	
	entrada.close();
	}
}
