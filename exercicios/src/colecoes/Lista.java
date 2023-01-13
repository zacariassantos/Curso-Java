package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);  // podemos instanciar um objeto e colocar na lista
		lista.add(new Usuario("Carlos")); // ou já criar o objeto diretamente na lista
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome);// acessar pelo indice
		
		System.out.println(">>>>"+lista.remove(1));// pelo indice, retorna o que foi removido
		System.out.println(lista.remove(new Usuario("Manu"))); // atraves do objeto , equals , hashcode ele acha, o resultado do remove é boolean
		
		System.out.println("tem ?"+lista.contains(new Usuario("Lia"))); // se contém o objeto, retorna boolean
		System.out.println("tem ?"+lista.contains(u1)); // sem o hash e o equals, ele não acha , porem como u1 tem referencia de memoria ele acha 
		
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
