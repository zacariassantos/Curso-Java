package Controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("informe um dia da semana");
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println("1");
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("2");
		}else if("terça".equalsIgnoreCase(dia) 
		|| "terca".equalsIgnoreCase(dia)) {
			System.out.println("3");
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("6");
		}else if("sabádo".equalsIgnoreCase(dia) 
		 || "sabado".equalsIgnoreCase(dia)) {
			System.out.println("7");
		}else {
			System.out.println("sem retorno valido");
		}
			
	}
}
