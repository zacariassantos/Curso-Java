package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno  Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); // LIFO 
		System.out.println(livros.element()); // LIFO 
		
		for(String livro: livros) {
			System.out.println(">>"+livro); 
		}
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll()); // retorna null
//		System.out.println(livros.pop()); // Lança exceção
//		System.out.println(livros.remove()); // Lança exceção
		
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty();
		
		
	}
}
