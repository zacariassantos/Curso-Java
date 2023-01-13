package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // será feita a conversão implicita double -> Double (classe)
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste");
		conjunto.add(1); // int -> integer
		conjunto.add('X');

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("Teste"); // não adciona elementos iguais
		conjunto.add('X');
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.remove("Teste")); // remover elemento
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('X'));

		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.contains('x')); // verifica se o conjunto contem o elemento
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		//conjunto.addAll(nums); // união entre dois conjuntos
		//System.out.println(conjunto);
		
		conjunto.retainAll(nums);// intercesão mostra apenas o que os dois conjuntos tem em comum
		System.out.println(conjunto);
		
		conjunto.clear(); // limpa o conjunto
		System.out.println(conjunto);
	}

}
