package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e add -> adicionam elementos na fila
		// Diferença é o comportamento ocorre
		//quando a fila está CHEIA
		fila.add("Ana"); // retorna false
		fila.offer("Bia");// Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elementos 
		//da fila (sem remover)
		
		// Diferença é o comportamento ocorre
	    //quando a fila está VAZIA! 
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// Lança uma exceção
		System.out.println(fila.element());
		
		//Poll e Remve -?> obter o proximo elemento
		// da fila e remove
		
		// Diferença é o comportamento ocorre
	    //quando a fila está VAZIA!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); 
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}
}
