package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1,"Roberto"); // put vai substituir caso ja exista
		usuarios.put(20,"Ricardo"); // Roberto foi substituido
		usuarios.put(3,"Rafaela");
		usuarios.put(4,"Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // pega o conjunto das chaves, não ordena
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet()); // chave e valor ao mesmo tempo,
		
		System.out.println(usuarios.containsKey(20)); // verifica se contem a chave
		System.out.println(usuarios.containsValue("Rebeca")); // verifica se contem o valor
		
		System.out.println(usuarios.get(20)); // obter o valor atraves da chave
		System.out.println(usuarios.remove(1));
		
		// percorrendo o map por chave
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		// percorrendo o map por valor
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		// percorrendo o map por chave e valor
		for(Entry<Integer, String> chaveValor: usuarios.entrySet()) {
			System.out.println(chaveValor);
		}
		for(Entry<Integer, String> chaveValor: usuarios.entrySet()) {
			System.out.print(chaveValor.getKey()+"==>");
			System.out.println(chaveValor.getValue());
		}
	}
}
