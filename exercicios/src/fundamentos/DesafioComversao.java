package fundamentos;

import java.util.Scanner;

public class DesafioComversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Infomre o primeiro Salário");
		  String valor1 = entrada.next().replace(",", ".");
		System.out.print("\nInfomre o segundo Salário");
		  String valor2 = entrada.next().replace(",", ".");
		System.out.print("\nInfomre o terceiro Salário");
		  String valor3 = entrada.next().replace(",", ".");
		  
		  double salario1 = Double.parseDouble(valor1);
		  double salario2 = Double.parseDouble(valor2);
		  double salario3 = Double.parseDouble(valor3);
		  
		  double media = (salario1 + salario2 + salario3)/3;
		  
		  System.out.println("A média dos Salário é:"+media);
		entrada.close();
	}
}
